package dev.bkjulien.clean_arch_demo.infrastructure.gateways;

import dev.bkjulien.clean_arch_demo.core.domain.entity.User;
import dev.bkjulien.clean_arch_demo.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj){
        return new UserEntity(
            userDomainObj.username(), userDomainObj.password(), userDomainObj.email()
        );
    }

    User toDomainObj(UserEntity userEntity){
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
