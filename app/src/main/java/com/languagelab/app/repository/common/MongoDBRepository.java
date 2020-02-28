package com.languagelab.app.repository.common;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MongoDBRepository<T> extends MongoRepository<T, String> {
}