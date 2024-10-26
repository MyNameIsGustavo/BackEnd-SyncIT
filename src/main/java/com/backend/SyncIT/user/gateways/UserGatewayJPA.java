package com.backend.SyncIT.user.gateways;

import com.backend.SyncIT.user.dto.CreateUserDTO;
import com.backend.SyncIT.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserGatewayJPA implements UserGatewayInterface {

    @Autowired
    private UserGatewayRepository repository;

    public UserEntity createUser(CreateUserDTO user){
        UserEntity obj = new UserEntity(null, user.getName(), user.getEmail(), user.getLastName(), user.getPhoneNumber(), user.getEnterprise(), user.getPassword());
        return repository.save(obj);
    }
}
