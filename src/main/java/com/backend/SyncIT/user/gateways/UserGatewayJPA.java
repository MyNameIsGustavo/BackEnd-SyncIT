package com.backend.SyncIT.user.gateways;

import com.backend.SyncIT.user.dto.CreateUserDTO;
import com.backend.SyncIT.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class UserGatewayJPA implements UserGatewayInterface {

    @Autowired
    private UserGatewayRepository repository;

    public Optional<UserEntity> findByIDGateway (Long id) { return repository.findById(id); }

    public List<UserEntity> getAllUsersGateway(){ return repository.findAll(); }

    public UserEntity createUserGateway(CreateUserDTO user){
        UserEntity obj = new UserEntity(null, user.getName(), user.getEmail(), user.getLastName(), user.getPhoneNumber(), user.getEnterprise(), user.getPassword());
        return repository.save(obj);
    }

}
