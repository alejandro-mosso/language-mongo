package com.languagelab.app.repository;

import com.languagelab.app.model.IMediaModel;
import com.languagelab.app.repository.common.MongoDBRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IMediaRepository extends MongoDBRepository<IMediaModel> {

    @Query("{ 'script' : {$regex: ?0, $options: 'i'}}")
    List<IMediaModel> findByKeyWord(String keyWord);

    @Query("{ 'id_history' : ObjectId(?0)}")
    List<IMediaModel> findByHistoryId(String id);

}
