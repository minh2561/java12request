package com.example.trangthai.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

//    @Column
//    @ManyToOne(cascade = CascadeType.MERGE)
//    private Integer level;

    @Column
    private LocalDateTime create_at;

    @Column
    private LocalDateTime update_at;


    @Column
    private Integer Id_Account;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "level")
    private StatusEntity StatusEntity;
}
