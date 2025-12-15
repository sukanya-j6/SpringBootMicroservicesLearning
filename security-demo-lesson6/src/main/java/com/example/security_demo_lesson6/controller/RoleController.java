package com.example.security_demo_lesson6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
    
    @GetMapping("/user")
    public String userApi(){
        return "user api";
    }

    @GetMapping("/admin")
    public String adminApi(){
        return "admin api";
    }
}
