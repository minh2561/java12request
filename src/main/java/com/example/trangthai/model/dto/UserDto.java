package com.example.trangthai.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Integer Id_User;
    private String name_user;
    private LocalDateTime update_at;
    private LocalDateTime create_at;
    private Integer level;
    private String name_status;
    private Integer Id_Account;
}
