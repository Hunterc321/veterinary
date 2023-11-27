package com.example.veterinaryv2.service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pet")
public class PetEntity {
    private @Id
    @GeneratedValue Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private OwnerEntity ownerEntity;

}
