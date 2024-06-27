package com.devmisael.workshopmongo.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devmisael.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
