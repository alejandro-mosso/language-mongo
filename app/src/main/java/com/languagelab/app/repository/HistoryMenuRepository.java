package com.languagelab.app.repository;

import com.languagelab.app.model.HistoryMenuModel;
import com.languagelab.app.repository.common.MongoDBRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface HistoryMenuRepository extends MongoDBRepository<HistoryMenuModel> {


    @Query("{ 'title' : {$regex: ?0, $options: 'i' }")
    List<HistoryMenuModel> findByTitle(String title);

    /**
     * This method is used to find all Histories available for a particular source and target languages in MongoDB.
     * @param sourceLanguage The language you want to lear.
     * @param targetLanguage  The language you speak.
     * @return List<HistoryMenuModel> Returns a list Histories that match source and target languages.
     */
    @Query("{ 'sourceLanguage' : ?0, targetLanguage: ?1}")
    List<HistoryMenuModel> findByLanguage(String sourceLanguage, String targetLanguage);

}
