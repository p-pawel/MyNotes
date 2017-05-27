package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class NotesApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(NotesApplication.class, args);
    }
}