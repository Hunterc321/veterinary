package com.example.veterinaryv2.repository;

import com.example.veterinaryv2.service.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long> {
}
