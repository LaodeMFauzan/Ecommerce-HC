package com.hc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class EcommerceHcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceHcApplication.class, args);
    }

}
