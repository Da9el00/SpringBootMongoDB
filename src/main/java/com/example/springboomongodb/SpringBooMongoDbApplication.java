package com.example.springboomongodb;

import com.example.springboomongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBooMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBooMongoDbApplication.class, args);
    }

}
