package com.languagelab.app.dao;

import com.languagelab.app.repository.HistoryMenuRepository;
import com.languagelab.app.repository.IMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;
import com.languagelab.app.dao.common.MongoDBDao;
import com.languagelab.app.model.HistoryMenuModel;
import java.util.List;

@Service
public class HistoryMenuDao extends MongoDBDao<HistoryMenuModel> {

    @Autowired
    private HistoryMenuRepository repository;

    public List<HistoryMenuModel> findByTitle(String title) {
        return this.repository.findByTitle(title);
    }

    /**
     * This method is used to find all Histories available for a particular source and target languages.
     * @param sourceLanguage The language you want to lear.
     * @param targetLanguage  The language you speak.
     * @return List<HistoryMenuModel> Returns a list Histories that match source and target languages.
     */
    public List<HistoryMenuModel> findByLanguage(String sourceLanguage, String targetLanguage) {
        return this.repository.findByLanguage(sourceLanguage, targetLanguage);
    }

}
