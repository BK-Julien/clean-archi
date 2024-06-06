package dev.bkjulien.clean_arch_demo.core.domain.entity;

public record Utilisateur(
        String username,
        String password,
        String email
) {
}
