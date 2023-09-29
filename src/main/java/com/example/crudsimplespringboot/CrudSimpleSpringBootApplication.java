package com.example.crudsimplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.crudsimplespringboot.entidades")
public class CrudSimpleSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSimpleSpringBootApplication.class, args);
    }

}
