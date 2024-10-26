package com.backend.SyncIT.user;

import com.backend.SyncIT.user.dto.CreateUserDTO;
import com.backend.SyncIT.user.gateways.UserGatewayJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserGatewayJPA actionsJPA;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    public CreateUserDTO createUser(CreateUserDTO user) {
        String passwordRequest = user.getPassword();
        String bcryptPassword = passwordEncoder.encode(passwordRequest);
        user.setPassword(bcryptPassword);
        actionsJPA.createUser(user);
        return user;
    }
}
