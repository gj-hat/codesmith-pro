package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboottest1.*")
public class SpringBootTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest1Application.class, args);
    }

}
