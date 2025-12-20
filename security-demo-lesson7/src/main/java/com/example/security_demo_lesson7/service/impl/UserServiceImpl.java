package com.example.security_demo_lesson7.service.impl;

import com.example.security_demo_lesson7.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private String getLoggedInUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public String commonDashnoard() {
        return "Common Dashnoard :- "+getLoggedInUser();
    }

    @Override
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String userDashboard() {
        return "User Dashboard "+getLoggedInUser();
    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public String adminDashboard() {
        return "Admin Dashboard "+getLoggedInUser();
    }

}
