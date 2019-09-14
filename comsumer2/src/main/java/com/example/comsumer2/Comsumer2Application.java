package com.example.comsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.message"})
public class Comsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Comsumer2Application.class, args);
    }

}
