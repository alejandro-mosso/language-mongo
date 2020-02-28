package com.languagelab.app.dao.common;

import com.languagelab.app.repository.common.MongoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class MongoDBDao<T> {

    @Autowired
    protected MongoDBRepository<T> repository;

    public T findById(String id) {
        T response = repository.findById(id).orElse(null);
        if (response != null) {
            populate(response);
        }
        return response;
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public List<T> findAll() {
        List<T> response = repository.findAll();
        for (T item : response) {
            populate(item);
        }
        return response;
    }

    public List<T> findAllById(List<String> ids) {
        if (ids != null && ids.size() > 0) {
            ArrayList<T> response = new ArrayList<>();
            repository.findAllById(ids).forEach(response::add);

            if (response != null && response.size() > 0) {
                for (T item : response) {
                    populate(item);
                }
            }

            return response;
        }

        return null;
    }

    public T save(T model) {
        if (model != null) {
            process(model);
            T entity = repository.save(model);
            populate(entity);
            return entity;
        }

        return null;
    }

    public List<T> saveAll(List<T> models) {

        if (models != null && models.size() > 0) {
            for (T model : models) {
                process(model);
            }
            return repository.saveAll(models);
        }

        return new ArrayList<>();
    }

    protected void process(T model) {
    }

    protected void populate(T model) {
    }

}
