package com.example.trangthai.service;

import com.example.trangthai.model.bo.respon;
import com.example.trangthai.model.bo.responPage;
import com.example.trangthai.model.in.StatusIn;
import org.springframework.stereotype.Service;

@Service
public interface StatusService {
    responPage getAll();
    respon create (StatusIn StatusIn);
//    respon delete (Integer Id_Status);
    respon update (Integer Id_Status, StatusIn StatusIn);
}
