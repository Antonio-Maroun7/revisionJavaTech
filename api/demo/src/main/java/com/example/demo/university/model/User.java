package com.example.demo.university.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;

    @Column(unique = true,nullable = false,length=50)
    private String username;

    @Column(nullable = false)
    private String password;

    private String firstname;
    private String lastName;

    @Column(nullable = false)
    private Role role =Role.USER;

    @Column(nullable = false)
    private boolean active = true;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();






}
