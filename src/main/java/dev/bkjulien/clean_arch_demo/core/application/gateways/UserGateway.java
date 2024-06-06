package dev.bkjulien.clean_arch_demo.core.application.gateways;

import dev.bkjulien.clean_arch_demo.core.domain.entity.Utilisateur;

public interface UserGateway {
    Utilisateur createUser(Utilisateur user);
}
