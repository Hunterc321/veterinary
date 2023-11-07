package com.example.veterinaryv2.service.entity;

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
    private Long petId;
    private String customerDetails;
    private LocalDateTime dateTime;
    private Long estimatedMinutes;
    @ManyToOne
    @JoinColumn(name = "vet_id")
    private VeterinaryEntity doctor;
}
