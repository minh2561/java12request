package com.example.trangthai.service.imp;

import com.example.trangthai.mapper.StatusMapper;
import com.example.trangthai.model.bo.respon;
import com.example.trangthai.model.bo.responPage;
import com.example.trangthai.model.dto.StatusDto;
import com.example.trangthai.model.entity.StatusEntity;
import com.example.trangthai.model.in.StatusIn;
import com.example.trangthai.responsitory.StatusResponsitory;
import com.example.trangthai.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Service
public class StatusImp implements StatusService {

    @Autowired
    private StatusResponsitory StatusResponsitory;


    @Override
    public responPage getAll() {
        List<StatusEntity> list=StatusResponsitory.findAll(Sort.by(Sort.Direction.ASC,"level"));
        List<StatusDto> listDto =list.stream().map(StatusMapper::mapEntity).collect(Collectors.toList());
        return new responPage("message",listDto);
    }

    @Override
    public respon create(StatusIn StatusIn) {
        String nameStatus =  StatusIn.getName_Status();
        Integer levelStatus = StatusIn.getLevel();
        if (nameStatus.length() >0 || levelStatus > 0){
            try {
                StatusEntity StatusEntity = StatusMapper.mapIn(StatusIn);
                StatusResponsitory.save(StatusEntity);
                return new respon(true,"create status success");
            }
            catch (Exception exception)
            {
                return new respon(false,"STATUS FAILURE");
            }
        }else {
            return new respon(false,"STATUS FAILURE");
        }

    }

//    @Override
//    public respon delete(Integer Id_Status) {
//        StatusEntity StatusEntity = StatusResponsitory.getById(Id_Status);
//        StatusResponsitory.delete(StatusEntity);
//        return new respon(true,"delete status success");
//    }

    @Override
    public respon update(Integer Id_Status, StatusIn StatusIn) {
        StatusEntity StatusEntity = StatusResponsitory.getById(Id_Status);
        StatusEntity.setId_Status(Id_Status);
        StatusEntity.setName_Status(StatusIn.getName_Status());
        StatusEntity.setLevel(StatusIn.getLevel());
        StatusResponsitory.save(StatusEntity);
        return new respon(true,"update status success");
    }
}
