package com.carloshenrique.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carloshenrique.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
