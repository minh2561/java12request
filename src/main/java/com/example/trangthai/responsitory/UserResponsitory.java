package com.example.trangthai.responsitory;

import com.example.trangthai.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserResponsitory extends JpaRepository<UserEntity, Integer> {
    UserEntity getById(Integer Id_User);

    @Query(value = "SELECT * FROM user ORDER BY level ASC limit 1", nativeQuery = true)
    List<UserEntity> findAllLimit();

    @Query(value = "SELECT * FROM user ORDER BY level ASC", nativeQuery = true)
    List<UserEntity> findAll();
}
