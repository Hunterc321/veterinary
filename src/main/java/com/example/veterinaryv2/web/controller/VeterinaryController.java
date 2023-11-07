package com.example.veterinaryv2.web.controller;

import com.example.veterinaryv2.service.VeterinaryService;
import com.example.veterinaryv2.service.entity.VeterinaryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/veterinaries")
public class VeterinaryController {
    private final VeterinaryService veterinaryService;

    @Autowired
    public VeterinaryController(VeterinaryService veterinaryService) {
        this.veterinaryService = veterinaryService;
    }

    @GetMapping("/appointments")
    public List<VeterinaryEntity> getVeterinariesWithAppointments(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return veterinaryService.getVeterinariesWithAppointments(date);
    }
}
