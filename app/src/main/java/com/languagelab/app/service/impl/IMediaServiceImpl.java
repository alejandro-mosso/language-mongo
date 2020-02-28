package com.languagelab.app.service.impl;

import com.languagelab.app.dao.IMediaDao;
import com.languagelab.app.model.IMediaModel;
import com.languagelab.app.service.IMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IMediaServiceImpl implements IMediaService {

    @Autowired
    private IMediaDao dao;

    public IMediaModel save(IMediaModel model) {
        return this.dao.save(model);
    }
    public IMediaModel delete(String id) {
        IMediaModel model = this.dao.findById(id);
        this.dao.deleteById(id);
        return model;
    }
    public List<IMediaModel> findByKeyWord(String keyWord) {
        return this.dao.findByKeyWord(keyWord);
    }
    public List<IMediaModel> findByHistoryId(String idHistory) {
        return this.dao.findByHistoryId(idHistory);
    }

}
