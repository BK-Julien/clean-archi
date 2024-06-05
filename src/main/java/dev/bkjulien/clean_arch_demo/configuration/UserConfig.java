package dev.bkjulien.clean_arch_demo.configuration;

import dev.bkjulien.clean_arch_demo.core.application.gateways.UserGateway;
import dev.bkjulien.clean_arch_demo.core.application.usecases.CreateUserInteractor;
import dev.bkjulien.clean_arch_demo.infrastructure.controllers.UserDTOMapper;
import dev.bkjulien.clean_arch_demo.infrastructure.gateways.UserEntityMapper;
import dev.bkjulien.clean_arch_demo.infrastructure.gateways.UserRepositoryGateway;
import dev.bkjulien.clean_arch_demo.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    public CreateUserInteractor createUseCase(UserGateway userGateway){
        return new CreateUserInteractor(userGateway);
    }
    @Bean
    public UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }
    @Bean
    public UserEntityMapper userEntityMapper(){
        return new UserEntityMapper();
    }
    @Bean
    public UserDTOMapper userDTOMapper(){
        return new UserDTOMapper();
    }
}
