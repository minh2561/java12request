package com.example.trangthai.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Integer Id_User;
    private String name_user;
    private Integer level;
    private Date update_at;
    private Integer Id_Account;
}
