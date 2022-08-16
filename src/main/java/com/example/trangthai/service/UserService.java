package com.example.trangthai.service;

import com.example.trangthai.model.bo.respon;
import com.example.trangthai.model.bo.responPage;
import com.example.trangthai.model.in.UserIn;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    responPage getAll();
    respon create (UserIn UserIn);
    respon delete (Integer Id_User);
    respon update (Integer Id_User, UserIn UserIn);
}
