package com.example.trangthai.service;

import com.example.trangthai.model.bo.respon;
import com.example.trangthai.model.bo.responPage;
import com.example.trangthai.model.in.RoleIn;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    responPage getAll();
    respon create (RoleIn RoleIn);
    respon delete (Integer Id_Role);
    respon update (Integer Id_Role, RoleIn RoleIn);
}
