package com.tkcodes.java.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SpringbootController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
    
}
