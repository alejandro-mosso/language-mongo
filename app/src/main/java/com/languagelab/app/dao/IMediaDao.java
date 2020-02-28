package com.languagelab.app.dao;

import com.languagelab.app.dao.common.MongoDBDao;
import com.languagelab.app.model.HistoryMenuModel;
import com.languagelab.app.model.IMediaModel;
import com.languagelab.app.repository.IMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMediaDao extends MongoDBDao<IMediaModel> {

    @Autowired
    private IMediaRepository repository;

    public List<IMediaModel> findByKeyWord(String keyWord) {
        return this.repository.findByKeyWord(keyWord);
    }

    public List<IMediaModel> findByHistoryId(String id) {
        return this.repository.findByHistoryId(id);
    }
}
