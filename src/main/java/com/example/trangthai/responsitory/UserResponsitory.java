package com.example.trangthai.responsitory;

import com.example.trangthai.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserResponsitory extends JpaRepository<UserEntity, Integer> {
    UserEntity getById(Integer Id_User);
}
