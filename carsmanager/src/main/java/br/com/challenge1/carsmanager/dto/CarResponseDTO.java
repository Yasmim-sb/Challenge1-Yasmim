package br.com.challenge1.carsmanager.dto;

import br.com.challenge1.carsmanager.entity.CarBrand;
import lombok.Data;

@Data
public class CarResponseDTO {

    private String model;

    private CarBrand brand;

    private String color;

    private String fabricationYear;

}
