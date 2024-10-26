package com.backend.SyncIT.user.gateways;

import com.backend.SyncIT.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGatewayRepository extends JpaRepository<UserEntity, Long> {
}
