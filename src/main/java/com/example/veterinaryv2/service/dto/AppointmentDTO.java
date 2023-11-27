package com.example.veterinaryv2.service.dto;

import com.example.veterinaryv2.service.entity.PetEntity;
import com.example.veterinaryv2.service.entity.VeterinaryEntity;

import java.time.LocalDateTime;

public record AppointmentDTO(Long id, PetDTO pet, String customerDetails, LocalDateTime dateTime, Long estimatedMinutes, VeterinaryDTO veterinary) {
}
