package com.example.veterinaryv2.service.mapper;

import com.example.veterinaryv2.service.dto.AppointmentDTO;
import com.example.veterinaryv2.service.entity.AppointmentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = VeterinaryMapper.class)
public interface AppointmentMapper {
    AppointmentDTO appointmentEntityToAppointmentDTO(AppointmentEntity appointmentEntity);
}
