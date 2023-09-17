package br.com.challenge1.carsmanager.dto;

import br.com.challenge1.carsmanager.entity.CarBrand;
import jakarta.persistence.Entity;
import lombok.*;

@Data
public class DTOCar {
   @NonNull
    private String chassisId;
   @NonNull
    private String model;
   @NonNull
    private CarBrand brand;
   @NonNull
    private String color;
   @NonNull
    private String fabricationYear;


}
