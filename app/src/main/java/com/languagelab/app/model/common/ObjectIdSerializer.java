package com.languagelab.app.model.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.bson.types.ObjectId;
import java.io.IOException;

public class ObjectIdSerializer extends JsonSerializer<ObjectId> {

    @Override
    public void serialize(ObjectId objectId, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        if(objectId == null ){
            jgen.writeNull();
        }
        else{
            jgen.writeString(objectId.toString());
        }
    }
}
