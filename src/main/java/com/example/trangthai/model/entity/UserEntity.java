package com.example.trangthai.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id_User;

    @Column(length = 64)
    private String name_user;

    @Column
    private Integer level;

//    @Column
//    @LastModifiedDate
//    private Date create_at;

    @Column
    @LastModifiedDate
    private Date update_at;

    @Column
    private Integer Id_Account;
//    @ManyToOne(cascade = CascadeType.MERGE)
//    @JoinColumn(name = "level")
//    private StatusEntity StatusEntity;
}
