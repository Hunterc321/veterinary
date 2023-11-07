package com.example.veterinaryv2.service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "veterinary")
public class VeterinaryEntity {
    private @Id @GeneratedValue Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "vet_id")
    private List<AppointmentEntity> appointments;
}
