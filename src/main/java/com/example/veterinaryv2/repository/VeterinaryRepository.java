package com.example.veterinaryv2.repository;

import com.example.veterinaryv2.service.entity.VeterinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface VeterinaryRepository extends JpaRepository<VeterinaryEntity, Long> {

    @Query("SELECT DISTINCT v FROM VeterinaryEntity v LEFT JOIN FETCH v.appointments a " +
            "WHERE CAST(a.dateTime AS date) = :date AND SIZE(v.appointments) > 0")
    List<VeterinaryEntity> findVeterinariesWithAppointmentsOnDate(@Param("date") LocalDate date);
}
