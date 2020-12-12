package com.dong.demo.service;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class Myservice {


    @Retryable(value = RuntimeException.class)
    public void retryService(String sql) {
        System.out.println("retry");

        throw new RuntimeException();
    }

    @Recover
    void recover(RuntimeException runtimeException, String sql) {
        System.out.println("recover");
    }
}
