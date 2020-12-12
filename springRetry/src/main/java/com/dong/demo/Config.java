package com.dong.demo;


import com.dong.demo.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Autowired
    Myservice myservice;

    @Bean
    String test(){

        myservice.retryService("test");

        return "test";

    }

}
