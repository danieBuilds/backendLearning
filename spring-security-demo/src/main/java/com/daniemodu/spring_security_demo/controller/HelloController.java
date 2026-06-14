package com.daniemodu.spring_security_demo.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HelloController {
    @GetMapping("hello")
    public String hello(HttpSession session){
        return "Hello ";
    }
}
