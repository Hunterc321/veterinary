package com.example.veterinaryv2.service.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "veterinary")
@NamedEntityGraph(
        name = "veterinary-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("appointments")
        }
)
public class VeterinaryEntity {
    private @Id @GeneratedValue Long id;
    private String name;
    @JsonIgnoreProperties("veterinary")
    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true, mappedBy = "veterinary")
    private List<AppointmentEntity> appointments;
}
