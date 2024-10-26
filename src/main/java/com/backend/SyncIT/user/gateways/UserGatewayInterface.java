package com.backend.SyncIT.user.gateways;

import com.backend.SyncIT.user.dto.CreateUserDTO;
import com.backend.SyncIT.user.entity.UserEntity;

public interface UserGatewayInterface {
    UserEntity createUser(CreateUserDTO user);
}
