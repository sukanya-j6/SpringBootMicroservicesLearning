package com.example.security_demo_lesson7.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterRequest {
    private String userName;
    private String password;
    private String role;
}
