package com.example.veterinaryv2.service.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "appointment")
public class AppointmentEntity {
    private @Id
    @GeneratedValue Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id")
    private PetEntity pet;
    private String customerDetails;
    @Column(name = "datetime")
    private LocalDateTime dateTime;
    private Long estimatedMinutes;
    @JsonIgnoreProperties("appointments")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vet_id")
    private VeterinaryEntity veterinary;
}
