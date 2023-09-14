package br.com.challenge1.carsmanager.controller;

import br.com.challenge1.carsmanager.DTOCar;
import br.com.challenge1.carsmanager.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private final CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }

//    @PostMapping
//    public DTOCar registrer(@RequestBody DTOCar DTOcar){
//        //registrar um carro
//    }

//    @GetMapping("/{chassild}")
//    public DTOCar getByChassild(@PathVariable String chassild) {
//        //buscar carro pelo chassild
//    }
}
