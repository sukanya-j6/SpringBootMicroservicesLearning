package com.example.security_demo_lesson7.controller;

import com.example.security_demo_lesson7.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    private final UserService userService;

    public RoleController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    @PreAuthorize("isAuthenticated()")
    public String index() {
        return userService.commonDashnoard();
    }

    // Accessible only by USER or ADMIN
    @RequestMapping("/user")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String user() {
        return userService.userDashboard();
    }

    // Accessible only by ADMIN
    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin() {
        return userService.adminDashboard();
    }
}
