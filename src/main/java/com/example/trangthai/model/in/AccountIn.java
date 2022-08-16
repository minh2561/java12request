package com.example.trangthai.model.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountIn {
private String email;
private String userName;
private String password;
private Integer IdRole;
}
