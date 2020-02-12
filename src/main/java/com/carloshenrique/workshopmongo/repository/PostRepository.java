package com.carloshenrique.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carloshenrique.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
