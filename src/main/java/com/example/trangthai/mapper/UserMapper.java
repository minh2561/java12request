package com.example.trangthai.mapper;

import com.example.trangthai.model.dto.StatusDto;
import com.example.trangthai.model.dto.UserDto;
import com.example.trangthai.model.entity.StatusEntity;
import com.example.trangthai.model.entity.UserEntity;
import com.example.trangthai.model.in.UserIn;

import java.time.LocalDateTime;

public class UserMapper {
    public static UserEntity mapIn(UserIn UserIn) {
        UserEntity UserEntity = new UserEntity();
        UserEntity.setName_user(UserIn.getName_user());
        UserEntity.setId_Account(UserIn.getId_Account());
        return UserEntity;
    }

    public static UserDto mapEntity(UserEntity UserEntity) {
        UserDto UserDto = new UserDto();
        UserDto.setId_User(UserEntity.getId_User());
        UserDto.setName_user(UserEntity.getName_user());
        UserDto.setUpdate_at(UserEntity.getUpdate_at());
        UserDto.setCreate_at(UserEntity.getCreate_at());
        UserDto.setId_Account(UserEntity.getId_Account());
        if (UserEntity.getStatusEntity() == null) {
            UserDto.setLevel(null);
        } else {
            UserDto.setLevel(UserEntity.getStatusEntity().getLevel());
            UserDto.setName_status(UserEntity.getStatusEntity().getName_Status());
        }
        return UserDto;
    }
}
