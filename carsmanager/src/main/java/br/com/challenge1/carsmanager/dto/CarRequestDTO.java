package br.com.challenge1.carsmanager.dto;

import br.com.challenge1.carsmanager.entity.CarBrand;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
public class CarRequestDTO {

    @NotBlank
    private String model;

    private CarBrand brand;

    @NotBlank
    private String color;

    @NotBlank
    private String fabricationYear;

}
