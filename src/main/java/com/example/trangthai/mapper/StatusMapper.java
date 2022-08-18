package com.example.trangthai.mapper;

import com.example.trangthai.model.dto.StatusDto;
import com.example.trangthai.model.entity.StatusEntity;
import com.example.trangthai.model.in.StatusIn;

public class StatusMapper {
    public static StatusEntity mapIn(StatusIn StatusIn){
        StatusEntity StatusEntity = new StatusEntity();
        StatusEntity.setName_Status(StatusIn.getName_Status());
        StatusEntity.setLevel(StatusIn.getLevel());
        return StatusEntity;
    }

    public static StatusDto mapEntity(StatusEntity StatusEntity){
        StatusDto StatusDto = new StatusDto();
        StatusDto.setId_Status(StatusEntity.getId_Status());
        StatusDto.setName_Status(StatusEntity.getName_Status());
        StatusDto.setLevel(StatusEntity.getLevel());
        return StatusDto;
    }
}
