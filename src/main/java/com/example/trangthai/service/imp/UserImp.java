package com.example.trangthai.service.imp;

import com.example.trangthai.mapper.UserMapper;
import com.example.trangthai.model.bo.respon;
import com.example.trangthai.model.bo.responPage;
import com.example.trangthai.model.dto.UserDto;
import com.example.trangthai.model.entity.UserEntity;
import com.example.trangthai.model.in.UserIn;
import com.example.trangthai.responsitory.UserResponsitory;
import com.example.trangthai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserImp implements UserService {
    @Autowired
    private UserResponsitory UserResponsitory;


    @Override
    public responPage getAll() {
        List<UserEntity> list=UserResponsitory.findAll();
        List<UserDto> listDto =list.stream().map(UserMapper::mapEntity).collect(Collectors.toList());
        return new responPage("message",listDto);
    }

    @Override
    public respon create(UserIn UserIn) {
        UserEntity UserEntity = UserMapper.mapIn(UserIn);
        UserResponsitory.save(UserEntity);
        return new respon(true,"create user success");
    }

    @Override
    public respon delete(Integer Id_User) {
        UserEntity UserEntity = UserResponsitory.getById(Id_User);
        UserResponsitory.delete(UserEntity);
        return new respon(true,"delete user success");
    }

    @Override
    public respon update(Integer Id_User, UserIn UserIn) {
        UserEntity UserEntity = UserResponsitory.getById(Id_User);
        UserEntity.setId_User(Id_User);
        UserEntity.setName_user(UserIn.getName_user());
        UserEntity.setId_Account(UserIn.getId_Account());
        UserEntity.setLevel(UserIn.getLevel());
        UserEntity.setName_user(UserIn.getName_user());
//        UserEntity.setUpdate_at();
        UserResponsitory.save(UserEntity);
        return new respon(true,"update post success");
    }
}
