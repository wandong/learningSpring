package com.dong.demo;

import com.dong.demo.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.retry.annotation.EnableRetry;


/**
 * https://www.baeldung.com/spring-retry
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableRetry
@EnableAspectJAutoProxy
public class RetryApplication {



    public static void main(String[] args) {

        System.out.println("hello world");

        SpringApplication.run(RetryApplication.class, args);
    }

}
