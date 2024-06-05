package dev.bkjulien.clean_arch_demo.infrastructure.controllers;

public record CreateUserResponse(
        String username,
        String email
) {
}
