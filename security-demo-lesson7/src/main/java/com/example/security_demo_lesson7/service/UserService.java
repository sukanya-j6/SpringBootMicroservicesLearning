package com.example.security_demo_lesson7.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String commonDashnoard();
    String userDashboard();
    String adminDashboard();

}
