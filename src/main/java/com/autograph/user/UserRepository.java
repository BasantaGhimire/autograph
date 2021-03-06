package com.autograph.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;



public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByAddress(String address);
}
