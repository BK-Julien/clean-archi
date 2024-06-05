package dev.bkjulien.clean_arch_demo.infrastructure.controllers;

public record CreateUserRequest(
        String username,
        String password,
        String email
) {
}
