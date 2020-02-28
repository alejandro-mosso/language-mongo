package com.languagelab.app.service.impl;

import com.languagelab.app.service.HistoryMenuService;
import com.languagelab.app.dao.HistoryMenuDao;
import com.languagelab.app.model.HistoryMenuModel;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class HistoryMenuServiceImpl implements HistoryMenuService {

    @Autowired
    private HistoryMenuDao dao;

    public List<HistoryMenuModel> findAllHistories() {
        return this.dao.findAll();
    }
    public List<HistoryMenuModel> findByLanguage(String src, String tar) {
        return this.dao.findByLanguage(src, tar);
    }
    public List<HistoryMenuModel> findByTitle(String title) {
        return this.dao.findByTitle(title);
    }
    public HistoryMenuModel save(HistoryMenuModel model) {
        return this.dao.save(model);
    }
    public HistoryMenuModel delete(String id) {
        HistoryMenuModel deleted = this.dao.findById(id);
        this.dao.deleteById(id);
        return deleted;
    }
}
