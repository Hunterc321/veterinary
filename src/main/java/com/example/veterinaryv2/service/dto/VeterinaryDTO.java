package com.example.veterinaryv2.service.dto;

import java.util.List;

public record VeterinaryDTO(Long id, String name, List<AppointmentDTO> appointments) {
}
