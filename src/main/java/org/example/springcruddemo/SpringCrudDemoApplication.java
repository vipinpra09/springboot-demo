package org.example.springcruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudDemoApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringCrudDemoApplication.class, args);
        System.out.println("Spring CRUD Demo Application has been started");
    }

}
