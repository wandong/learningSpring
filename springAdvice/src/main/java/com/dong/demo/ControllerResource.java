package com.dong.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "/v1")
public class ControllerResource {


    @RequestMapping(value = "hello")
    ResponseEntity<String> helloWord(String string) throws Exception {

        if (true) {
            throw new Exception();

        }
        return ResponseEntity.ok("Hello Word");
    }

}
