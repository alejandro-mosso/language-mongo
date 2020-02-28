package com.languagelab.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.languagelab.app.model.common.MongoDBEntity;
import com.languagelab.app.model.common.ObjectIdSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "iMedia")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IMediaModel extends MongoDBEntity {

    String title;
    String src;
    String type;
    String script;
    List<String> customDefinitions;
    @JsonSerialize(using = ObjectIdSerializer.class)
    ObjectId id_history;

}
