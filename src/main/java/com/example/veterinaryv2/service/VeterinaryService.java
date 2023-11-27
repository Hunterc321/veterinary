package com.example.veterinaryv2.service;

import com.example.veterinaryv2.repository.VeterinaryRepository;
import com.example.veterinaryv2.service.database.VeterinaryDatabaseService;
import com.example.veterinaryv2.service.dto.VeterinaryDTO;
import com.example.veterinaryv2.service.entity.VeterinaryEntity;
import com.example.veterinaryv2.service.mapper.VeterinaryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VeterinaryService {

    private VeterinaryDatabaseService veterinaryDatabaseService;

    private final VeterinaryMapper veterinaryMapper;


    public List<VeterinaryDTO> getVeterinariesWithAppointments(LocalDate date) {
        if (date == null) {
            date = LocalDate.now();
        }
        List<VeterinaryEntity> veterinariesEntity = veterinaryDatabaseService.findVeterinariesWithAppointmentsOnDate(date);
        return veterinariesEntity.stream()
                .map(veterinaryMapper::veterinaryToVeterinaryDTO)
                .collect(Collectors.toList());
    }
}
