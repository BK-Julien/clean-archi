package dev.bkjulien.clean_arch_demo.infrastructure.gateways;

import dev.bkjulien.clean_arch_demo.core.domain.entity.Utilisateur;
import dev.bkjulien.clean_arch_demo.infrastructure.persistence.UtilisateurEntity;

public class UserEntityMapper {
    UtilisateurEntity toEntity(Utilisateur userDomainObj){
        return new UtilisateurEntity(
            userDomainObj.username(), userDomainObj.password(), userDomainObj.email()
        );
    }

    Utilisateur toDomainObj(UtilisateurEntity userEntity){
        return new Utilisateur(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
