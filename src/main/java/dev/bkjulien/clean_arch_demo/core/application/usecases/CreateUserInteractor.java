package dev.bkjulien.clean_arch_demo.core.application.usecases;

import dev.bkjulien.clean_arch_demo.core.application.gateways.UserGateway;
import dev.bkjulien.clean_arch_demo.core.domain.entity.Utilisateur;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public Utilisateur createUser(Utilisateur utilisateur){
        return userGateway.createUser(utilisateur);
    }
}
