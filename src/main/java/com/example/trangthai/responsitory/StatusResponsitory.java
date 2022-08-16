package com.example.trangthai.responsitory;

import com.example.trangthai.model.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusResponsitory extends JpaRepository<StatusEntity,Integer> {
    StatusEntity getById(Integer Id_Status);
}
