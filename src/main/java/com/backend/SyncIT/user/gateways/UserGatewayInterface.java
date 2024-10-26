package com.backend.SyncIT.user.gateways;

import com.backend.SyncIT.user.dto.CreateUserDTO;
import com.backend.SyncIT.user.dto.UpdateUserDTO;
import com.backend.SyncIT.user.entity.UserEntity;
import java.util.List;
import java.util.Optional;

public interface UserGatewayInterface {
    UserEntity createUserGateway(CreateUserDTO user);
    List<UserEntity> getAllUsersGateway();
    Optional<UserEntity> findByIDUserGateway(Long id);
    void deleteUserGateway(Long id);
}
