package com.test.aws;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping("/hello")
    public String pp(){
        return "hello world";
    }
}
