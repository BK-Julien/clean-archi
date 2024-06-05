package dev.bkjulien.clean_arch_demo.core.domain.entity;

public record User(
        String username,
        String password,
        String email
) {
}
