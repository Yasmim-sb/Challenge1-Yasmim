package br.com.challenge1.carsmanager.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestBody;

@Data
public class DTOCar {
    private String chassisId;
    private String model;
    private String brand;
    private String color;
    private int fabricationYear;

}
