package com.example.trangthai.model.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserIn {
    private String name_user;
    private Integer level;
    private Integer id_Account;
}
