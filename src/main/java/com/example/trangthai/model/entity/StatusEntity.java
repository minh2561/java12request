package com.example.trangthai.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "status")
@AllArgsConstructor
@NoArgsConstructor

public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id_Status;

    @Column(length = 64)
    private String name_Status;

    @Column
    private Integer level;
//    @Column
//    @OneToMany (mappedBy = "UserEntity", cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
//    private Collection<UserEntity> UserEntity;
}
