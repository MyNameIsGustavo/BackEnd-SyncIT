package com.backend.SyncIT.user;

import com.backend.SyncIT.user.dto.CreateUserDTO;
import com.backend.SyncIT.user.entity.UserEntity;
import com.backend.SyncIT.user.gateways.UserGatewayJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserGatewayJPA actionsJPA;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void deleteUserService(Long id) { actionsJPA.deleteUserGateway(id); }

    public Optional<UserEntity> findByIDService(Long id){ return actionsJPA.findByIDUserGateway(id); }

    public List<UserEntity> getAllUsersService(){
        return actionsJPA.getAllUsersGateway();
    }

    public CreateUserDTO createUserService(CreateUserDTO user) {
        String passwordRequest = user.getPassword();
        String bcryptPassword = passwordEncoder.encode(passwordRequest);
        user.setPassword(bcryptPassword);
        actionsJPA.createUserGateway(user);
        return user;
    }
}
