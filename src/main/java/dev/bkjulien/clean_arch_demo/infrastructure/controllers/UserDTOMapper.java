package dev.bkjulien.clean_arch_demo.infrastructure.controllers;

import dev.bkjulien.clean_arch_demo.core.domain.entity.User;

public class UserDTOMapper {
    public CreateUserResponse toResponse(User user){
        return new CreateUserResponse(user.username(),user.email());
    }

    public User toUser(CreateUserRequest request){
        return new User(request.username(), request.password(), request.email());
    }

}
