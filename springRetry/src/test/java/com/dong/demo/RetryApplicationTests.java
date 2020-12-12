package com.dong.demo;

import com.dong.demo.service.Myservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RetryApplicationTests {


    @Autowired
    private Myservice myservice;

    @Test
    void contextLoads() {
        myservice.retryService("ItemStream");

    }

}
