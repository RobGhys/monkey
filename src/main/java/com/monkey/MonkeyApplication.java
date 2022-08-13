package com.monkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.monkey")
public class MonkeyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonkeyApplication.class, args);
    }

}
