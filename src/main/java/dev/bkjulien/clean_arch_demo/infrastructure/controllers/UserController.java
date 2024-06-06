package dev.bkjulien.clean_arch_demo.infrastructure.controllers;

import dev.bkjulien.clean_arch_demo.core.application.usecases.CreateUserInteractor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {
    private final CreateUserInteractor createUserInteractor;
    private final UserDTOMapper userDTOMapper;

    public UserController(
            CreateUserInteractor createUserInteractor,
            UserDTOMapper userDTOMapper
    ) {
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    public CreateUserResponse create(@RequestBody CreateUserRequest createUserRequest){
        var userBusinessObj = userDTOMapper.toUser(createUserRequest);
        var user = createUserInteractor.createUser(userBusinessObj);
        return userDTOMapper.toResponse(user);
    }

}
