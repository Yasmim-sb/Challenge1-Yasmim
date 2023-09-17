package br.com.challenge1.carsmanager.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Table(name= "cars")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chassi_id")
    private Long chassisId;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;
    @Column(name = "fabrication_Year")
    private String fabricationYear;

    @NotNull
    @Enumerated(EnumType.STRING)
    private CarBrand brand;

}

