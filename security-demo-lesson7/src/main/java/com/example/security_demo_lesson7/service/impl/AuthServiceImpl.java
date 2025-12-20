package com.example.security_demo_lesson7.service.impl;

import com.example.security_demo_lesson7.dto.RegisterRequest;
import com.example.security_demo_lesson7.entity.User;
import com.example.security_demo_lesson7.repository.UserRepository;
import com.example.security_demo_lesson7.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String register(RegisterRequest request) {
        if(userRepository.findByUserName(request.getUserName()).isPresent()){
            throw new RuntimeException("Username is already in use");
        }

        User user = new User();
        user.setUserName(request.getUserName());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(request.getRole());

        userRepository.save(user);
        return "user registered successfully";
    }
}
