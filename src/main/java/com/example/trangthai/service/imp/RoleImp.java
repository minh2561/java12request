package com.example.trangthai.service.imp;

import com.example.trangthai.mapper.RoleMapper;
import com.example.trangthai.model.bo.respon;
import com.example.trangthai.model.bo.responPage;
import com.example.trangthai.model.dto.RoleDto;
import com.example.trangthai.model.entity.RoleEntity;
import com.example.trangthai.model.in.RoleIn;
import com.example.trangthai.responsitory.RoleResponsitory;
import com.example.trangthai.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoleImp implements RoleService {
    @Autowired
    private RoleResponsitory RoleResponsitory;


    @Override
    public responPage getAll() {
        List<RoleEntity> list = RoleResponsitory.findAll();
        List<RoleDto> listDto = list.stream().map(RoleMapper::mapEntity).collect(Collectors.toList());
        return new responPage("get role success", listDto);
    }

    @Override
    public respon create(RoleIn RoleIn) {
        RoleEntity RoleEntity = RoleMapper.mapIn(RoleIn);
        RoleResponsitory.save(RoleEntity);
        return new respon(true, "create role success");
    }

    @Override
    public respon delete(Integer Id_Role) {
        RoleEntity RoleEntity = RoleResponsitory.getById(Id_Role);
        RoleResponsitory.delete(RoleEntity);
        return new respon(true, "delete role success");
    }

    @Override
    public respon update(Integer Id_Role, RoleIn RoleIn) {
        RoleEntity RoleEntity = RoleResponsitory.getById(Id_Role);
        RoleEntity.setName_role(RoleIn.getName_role());
        RoleEntity.setId_Role(Id_Role);
        RoleResponsitory.save(RoleEntity);
        return new respon(true, "update role success");
    }
}
