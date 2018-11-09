package com.eduardosferreira.workshopsbmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eduardosferreira.workshopsbmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
