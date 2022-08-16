package com.example.trangthai.mapper;

import com.example.trangthai.model.dto.RoleDto;
import com.example.trangthai.model.entity.RoleEntity;
import com.example.trangthai.model.in.RoleIn;

public class RoleMapper {
    public static RoleEntity mapIn(RoleIn RoleIn){
        RoleEntity RoleEntity = new RoleEntity();
        RoleEntity.setName_role(RoleIn.getName_role());
        return RoleEntity;
    }

    public static RoleDto mapEntity(RoleEntity RoleEntity){
        RoleDto RoleDto = new RoleDto();
        RoleDto.setId_Role(RoleDto.getId_Role());
        RoleDto.setName_role(RoleDto.getName_role());
        return RoleDto;
    }
}
