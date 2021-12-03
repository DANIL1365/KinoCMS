package com.example.KinoCMS;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.example.KinoCMS.controller"})
//@EntityScan("com.example.KinoCMS.domain")
//@EnableJpaRepositories("com.example.KinoCMS.repos")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
