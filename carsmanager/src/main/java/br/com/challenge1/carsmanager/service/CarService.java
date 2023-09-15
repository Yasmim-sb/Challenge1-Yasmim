package br.com.challenge1.carsmanager.service;


import br.com.challenge1.carsmanager.repository.CarRepository;
import br.com.challenge1.carsmanager.entity.CarBrand;
import br.com.challenge1.carsmanager.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
@Service
public class CarService {
    private CarRepository carRepository;
    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
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

    private List<Car> cars = new ArrayList<>();

    public CarService() {
        // adicionando alguns carros à lista no construtor.
        //data.sql inicializ de dados
        cars.add(new Car(1L, "Camry", "Red", 2020,"Ford"));
        cars.add(new Car(2L, "Civic","Black", 2021,"Volvo"));
        cars.add(new Car(3L, "Focus","White", 2019,"BMW"));
        //Car(long l, String model, String red, int fabricationYear, String brand)
    }

    private boolean isValidBrand(CarBrand brand) {
        return brand != null && EnumSet.of(CarBrand.FORD, CarBrand.BMW, CarBrand.VOLVO, CarBrand.CHEVROLET).contains(brand);
    }

    public void findById(Long aLong) {
    }
}


