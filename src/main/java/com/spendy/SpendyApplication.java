package com.spendy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpendyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpendyApplication.class, args);
    }

    @RestController
    public class HelloWorldController {

        @GetMapping("/")
        public String hello() {
            return "Hello World from EatSmart Backend!";
        }
    }
}
