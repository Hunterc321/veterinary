package com.example.veterinaryv2.service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "pet")
public class PetEntity {
    private @Id
    @GeneratedValue Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private OwnerEntity ownerEntity;

}
