package com.example.veterinaryv2.service.database;

import com.example.veterinaryv2.repository.VeterinaryRepository;
import com.example.veterinaryv2.service.entity.VeterinaryEntity;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class VeterinaryDatabaseService {

    private VeterinaryRepository veterinaryRepository;

    @Transactional
    public List<VeterinaryEntity> findVeterinariesWithAppointmentsOnDate(LocalDate date) {
        return veterinaryRepository.findVeterinariesWithAppointmentsOnDate(date);
    }

}
