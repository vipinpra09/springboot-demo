package org.example.crudprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudPracApplication {

     static void main(String[] args) {
        SpringApplication.run(CrudPracApplication.class, args);
        System.out.println("Spring Boot Application Started");
    }

}
