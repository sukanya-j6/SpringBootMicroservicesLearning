package com.example.security_demo_lesson7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    /*
    @Bean
    public UserDetailsService  userDetailsService() {
        var user = User
                .withUsername("user")
                .password("{noop}user123")
                .roles("USER")
                .build();

        var admin = User
                .withUsername("admin")
                .password("{noop}admin123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }



    @Bean
    public SecurityFilterChain  securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/admin")
                .hasAnyRole("ADMIN")
                .requestMatchers("/user")
                .hasAnyRole("USER", "ADMIN")
                .requestMatchers("/")
                .hasAnyRole("USER", "ADMIN")).formLogin();

        return http.build();
    }

     */

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth ->
                auth.requestMatchers("/auth/register").permitAll()
                .anyRequest().authenticated()).formLogin();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
