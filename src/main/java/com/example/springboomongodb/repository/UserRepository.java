package com.example.springboomongodb.repository;

import com.example.springboomongodb.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

    Optional<User> findById(Long id);

    List<User> findAll();
}
