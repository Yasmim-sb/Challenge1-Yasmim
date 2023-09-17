package br.com.challenge1.carsmanager.service;

import br.com.challenge1.carsmanager.dto.DTOCar;
import br.com.challenge1.carsmanager.entity.Car;
import br.com.challenge1.carsmanager.entity.CarBrand;
import br.com.challenge1.carsmanager.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.EnumSet;
import java.util.Optional;
 @RequiredArgsConstructor
 @Service
  public class CarService {
    private final CarRepository carRepository;
   public Car save(Car car) {
    if (!isValidBrand(car.getBrand())) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid brand");
    }
        return carRepository.save(car);
    }
    public Car getById(long chassisId){
        Optional<Car> optionalCar = carRepository.findById(chassisId);
        return optionalCar.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found"));
    }
    private boolean isValidBrand(CarBrand brand) {
        return brand != null && EnumSet.of(CarBrand.FORD, CarBrand.BMW, CarBrand.VOLVO, CarBrand.CHEVROLET).contains(brand);
    }

 }

