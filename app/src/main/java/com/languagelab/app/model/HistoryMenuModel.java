package com.languagelab.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.languagelab.app.model.common.MongoDBEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "historyMenu")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HistoryMenuModel extends MongoDBEntity {
    String title;
    String level;
    String description;
    String sourceLanguage; /* The language you want to learn */
    String targetLanguage; /* The language you speak */
    String sourceLan; /* The language you want to learn */
    String targetLan; /* The language you speak */

    @Transient
    List<IMediaModel> imedia;
}
