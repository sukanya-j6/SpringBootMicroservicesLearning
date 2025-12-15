package com.example.security_demo_lesson7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/user")
    public String user() {
        return "user api";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin api";
    }


}
