package com.nuu.khtrashcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nuu"})
public class KhtrashcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhtrashcarApplication.class, args);
    }

}
