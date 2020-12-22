package com.dong.demo;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class SpringAdvice {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    String exceptionHanlder(Exception exception) {


        return "Exception ";

    }


}
