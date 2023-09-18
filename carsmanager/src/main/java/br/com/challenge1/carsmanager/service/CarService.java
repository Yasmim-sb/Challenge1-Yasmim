package br.com.challenge1.carsmanager.service;

import br.com.challenge1.carsmanager.dto.CarRequestDTO;
import br.com.challenge1.carsmanager.dto.CarResponseDTO;
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

    public CarResponseDTO save(CarRequestDTO car) {
        Car carEntity = getCar(car);
        var save = carRepository.save(carEntity);
        return getCarResponseDTO(save);
    }
    private static CarResponseDTO getCarResponseDTO(Car save) {
        var carResponseDTO = new CarResponseDTO();
        carResponseDTO.setBrand(save.getBrand());
        carResponseDTO.setColor(save.getColor());
        carResponseDTO.setModel(save.getModel());
        carResponseDTO.setFabricationYear(save.getFabricationYear());
        return carResponseDTO;
    }
    private Car getCar(CarRequestDTO car) {
        var carEntity = new Car();
        carEntity.setBrand(car.getBrand());
        carEntity.setModel(car.getModel());
        carEntity.setColor(car.getColor());
        carEntity.setFabricationYear(car.getFabricationYear());
        return carEntity;
    }
    public Car getById(long chassisId) {
        Optional<Car> optionalCar = carRepository.findById(chassisId);
        return optionalCar.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found"));
    }
    private boolean isValidBrand(CarBrand brand) {
        return brand != null && EnumSet.of(CarBrand.FORD, CarBrand.BMW, CarBrand.VOLVO, CarBrand.CHEVROLET).contains(brand);
    }
}