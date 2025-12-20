package com.example.security_demo_lesson7.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;

@Entity
@Table(name="USER_TABLE")
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name="NAME" ,unique=true,  nullable=false)
    private String userName;

    @Column(name="PASSWORD", unique=true,  nullable=false)
    private String password;

    // Example ROLE_USER, ROLE_ADMIN
    @Column(name="ROLE", unique=true,  nullable=false)
    private String role;
}
