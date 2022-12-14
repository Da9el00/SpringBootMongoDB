package com.example.springboomongodb.service;

import com.example.springboomongodb.document.User;
import com.example.springboomongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public void saveUser(Long id, String name){
        userRepository.save(new User(id ,name , 100,"test@email.com"));
    }


}
