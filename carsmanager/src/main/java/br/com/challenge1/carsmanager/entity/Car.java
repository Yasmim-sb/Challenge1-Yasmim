package br.com.challenge1.carsmanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    private int fabricationYear;

    @NotNull
    @Enumerated(EnumType.STRING)
    private CarBrand brand;


    public Car(long l, String model, String red, int fabricationYear, String brand) {
    }
 }

