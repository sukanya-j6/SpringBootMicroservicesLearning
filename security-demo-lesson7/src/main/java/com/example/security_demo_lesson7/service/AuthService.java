package com.example.security_demo_lesson7.service;

import com.example.security_demo_lesson7.dto.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    String register(RegisterRequest request);
}
