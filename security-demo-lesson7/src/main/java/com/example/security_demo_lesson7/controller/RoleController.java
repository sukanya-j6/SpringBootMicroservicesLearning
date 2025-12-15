package com.example.security_demo_lesson7.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @RequestMapping("/")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public String index() {
        return "Hello World";
    }

    // Accessible only by USER or ADMIN
    @RequestMapping("/user")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String user() {
        return "user api";
    }

    // Accessible only by ADMIN
    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin() {
        return "admin api";
    }
}
