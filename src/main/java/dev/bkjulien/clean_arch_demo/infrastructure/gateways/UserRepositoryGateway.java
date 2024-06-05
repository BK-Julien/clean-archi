package dev.bkjulien.clean_arch_demo.infrastructure.gateways;

import dev.bkjulien.clean_arch_demo.core.application.gateways.UserGateway;
import dev.bkjulien.clean_arch_demo.core.domain.entity.User;
import dev.bkjulien.clean_arch_demo.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        var userEntity = userEntityMapper.toEntity(userDomainObj);
        var savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }
}
