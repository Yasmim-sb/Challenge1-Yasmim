package br.com.challenge1.carsmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String chassisId;
    private String model;
    private String brand;
    private String color;
    private int fabricationYear;

//    public Car(String brand){
//
//    };
}

