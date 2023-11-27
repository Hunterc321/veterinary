package com.example.veterinaryv2.service.mapper;

import com.example.veterinaryv2.service.dto.AppointmentDTO;
import com.example.veterinaryv2.service.dto.VeterinaryDTO;
import com.example.veterinaryv2.service.entity.AppointmentEntity;
import com.example.veterinaryv2.service.entity.VeterinaryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AppointmentMapper.class})
public interface VeterinaryMapper {

    VeterinaryDTO veterinaryToVeterinaryDTO(VeterinaryEntity veterinaryEntity);

}
