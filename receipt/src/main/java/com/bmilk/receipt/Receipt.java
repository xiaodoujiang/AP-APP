package com.bmilk.receipt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Receipt {
    public static void main(String[] args) {
        SpringApplication.run(Receipt.class, args);
    }
}
