package com.example.trangthai.responsitory;

import com.example.trangthai.model.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleResponsitory extends JpaRepository<RoleEntity,Integer> {
    RoleEntity getById(Integer Id_Role);
}
