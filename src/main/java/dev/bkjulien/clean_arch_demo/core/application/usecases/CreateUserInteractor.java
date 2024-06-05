package dev.bkjulien.clean_arch_demo.core.application.usecases;

import dev.bkjulien.clean_arch_demo.core.application.gateways.UserGateway;
import dev.bkjulien.clean_arch_demo.core.domain.entity.User;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
