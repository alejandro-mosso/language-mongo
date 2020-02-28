package com.languagelab.app.service;

import java.util.List;
import com.languagelab.app.model.HistoryMenuModel;

public interface HistoryMenuService {
    List<HistoryMenuModel> findAllHistories();
    List<HistoryMenuModel> findByTitle(String title);
    List<HistoryMenuModel> findByLanguage(String src, String tar);
    HistoryMenuModel save(HistoryMenuModel model);
    HistoryMenuModel delete(String id);

}