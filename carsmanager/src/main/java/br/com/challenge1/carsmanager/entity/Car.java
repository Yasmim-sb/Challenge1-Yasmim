package br.com.challenge1.carsmanager.entity;

import jakarta.persistence.*;
import lombok.*;


@Table(name= "cars")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chassi_id", nullable = false)
    private Long chassisId;
    @Column(name = "model", nullable = false)
    private String model;
    @Column(name = "color", nullable = false)
    private String color;
    @Column(name = "fabrication_year", nullable = false)
    private String fabricationYear;

    @Enumerated(EnumType.STRING)
    private CarBrand brand;

}

