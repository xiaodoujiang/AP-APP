package com.bmilk.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Merchant {
    public static void main(String[] args) {
        SpringApplication.run(Merchant.class, args);
    }
}