package com.example.demo.university.dto;

public record LoginResponse(
        long id,
        String username,
        String firstName,
        String lastName,
        String role
) {
}