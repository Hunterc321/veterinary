package com.example.veterinaryv2.service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "owner")
public class OwnerEntity {
    private @Id
    @GeneratedValue Long id;
    private String name;
    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true, mappedBy = "ownerEntity")
    private List<PetEntity> pets;
}
