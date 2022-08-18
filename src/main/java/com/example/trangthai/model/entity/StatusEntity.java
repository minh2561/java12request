package com.example.trangthai.model.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

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

    @Column(length =64,unique = true,nullable = false)
    private String name_Status;

    @Column(unique = true,nullable = false)
    private Integer level;

    @OneToMany(mappedBy = "StatusEntity", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Collection<UserEntity> userEntities;

    @PreRemove
    private void preRemove() {
        userEntities.forEach(userEntity -> userEntity.setStatusEntity(null));
    }

}
