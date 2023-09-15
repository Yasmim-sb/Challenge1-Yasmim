package br.com.challenge1.carsmanager.bd;

import lombok.Data;

@Data
public class DTOCar {
    private String chassisId;
    private String model;
    private String brand;
    private String color;
    private int fabricationYear;

}
