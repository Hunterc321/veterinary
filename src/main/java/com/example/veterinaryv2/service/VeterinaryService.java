package com.example.veterinaryv2.service;

import com.example.veterinaryv2.repository.VeterinaryRepository;
import com.example.veterinaryv2.service.entity.AppointmentEntity;
import com.example.veterinaryv2.service.entity.VeterinaryEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VeterinaryService {
    @Autowired
    private VeterinaryRepository veterinaryRepository;

    public List<VeterinaryEntity> getVeterinariesWithAppointments(LocalDate date) {
        if (date == null) {
            date = LocalDate.now();
        }
        List<VeterinaryEntity> veterinaries = veterinaryRepository.findAll();
        for (VeterinaryEntity vet : veterinaries) {
            LocalDate finalDate = date;
            List<AppointmentEntity> appointments = vet.getAppointments().stream()
                    .filter(appointment -> appointment.getDateTime().toLocalDate().isEqual(finalDate))
                    .collect(Collectors.toList());
            vet.setAppointments(appointments);
        }
        return veterinaries;
    }
}
