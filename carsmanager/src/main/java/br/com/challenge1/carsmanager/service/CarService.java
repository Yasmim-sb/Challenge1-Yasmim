package br.com.challenge1.carsmanager.service;


import br.com.challenge1.carsmanager.CarRepository;
import br.com.challenge1.carsmanager.DTOCar;
import br.com.challenge1.carsmanager.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class CarService {//logica ao salvar e buscar dados do bd

    @Autowired
    private final CarRepository carRepository;


    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}


//public addCar(Car car){
//
//}
//}


