package dev.bkjulien.clean_arch_demo.infrastructure.controllers;

import dev.bkjulien.clean_arch_demo.core.domain.entity.Utilisateur;

public class UserDTOMapper {
    public CreateUserResponse toResponse(Utilisateur user){
        return new CreateUserResponse(user.username(),user.email());
    }

    public Utilisateur toUser(CreateUserRequest request){
        return new Utilisateur(request.username(), request.password(), request.email());
    }

}
