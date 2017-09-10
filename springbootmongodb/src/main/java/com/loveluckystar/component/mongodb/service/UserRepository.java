package com.loveluckystar.component.mongodb.service;

import com.loveluckystar.component.mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mxy on 2017/9/10.
 */
public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
    User findByAge(int age);
    User findById(int id);
}
