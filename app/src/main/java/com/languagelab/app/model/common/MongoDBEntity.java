package com.languagelab.app.model.common;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MongoDBEntity {

    @Id
    private String id;
}
