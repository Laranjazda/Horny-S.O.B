package com.hsob.HornySOB.repository;

import com.hsob.HornySOB.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
