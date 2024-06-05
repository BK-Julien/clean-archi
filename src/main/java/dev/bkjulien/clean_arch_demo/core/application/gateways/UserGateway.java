package dev.bkjulien.clean_arch_demo.core.application.gateways;

import dev.bkjulien.clean_arch_demo.core.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
