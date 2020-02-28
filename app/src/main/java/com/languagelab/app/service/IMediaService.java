package com.languagelab.app.service;

import com.languagelab.app.model.IMediaModel;

import java.util.List;

public interface IMediaService {

    IMediaModel save(IMediaModel model);
    IMediaModel delete(String id);
    List<IMediaModel> findByKeyWord(String keyWord);
    List<IMediaModel> findByHistoryId(String idHistory);

}
