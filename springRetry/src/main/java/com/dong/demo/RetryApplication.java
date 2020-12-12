package com.dong.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RetryApplication {


    public static void main(String[] args) {

        System.out.println("hello world");

        SpringApplication.run(RetryApplication.class, args);
    }

}
