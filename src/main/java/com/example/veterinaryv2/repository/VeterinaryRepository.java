package com.example.veterinaryv2.repository;

import com.example.veterinaryv2.service.entity.VeterinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinaryRepository extends JpaRepository<VeterinaryEntity, Long> {
}
