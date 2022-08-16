package com.example.trangthai.mapper;

import com.example.trangthai.model.dto.StatusDto;
import com.example.trangthai.model.dto.UserDto;
import com.example.trangthai.model.entity.StatusEntity;
import com.example.trangthai.model.entity.UserEntity;
import com.example.trangthai.model.in.UserIn;

public class UserMapper {
    public static UserEntity mapIn(UserIn UserIn){
        UserEntity UserEntity = new UserEntity();
        UserEntity.setName_user(UserIn.getName_user());
        UserEntity.setLevel(UserIn.getLevel());
        UserEntity.setId_Account(UserIn.getId_Account());
        return UserEntity;
    }

    public static UserDto mapEntity(UserEntity UserEntity){
        UserDto UserDto = new UserDto();
        UserDto.setId_User(UserEntity.getId_User());
        UserDto.setName_user(UserEntity.getName_user());
        UserDto.setLevel(UserEntity.getLevel());
        UserDto.setUpdate_at(UserEntity.getUpdate_at());
        return UserDto;
    }
}
