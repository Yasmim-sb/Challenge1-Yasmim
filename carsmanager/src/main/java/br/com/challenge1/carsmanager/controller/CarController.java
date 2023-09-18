package br.com.challenge1.carsmanager.controller;

import br.com.challenge1.carsmanager.dto.CarRequestDTO;
import br.com.challenge1.carsmanager.entity.Car;
import br.com.challenge1.carsmanager.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @GetMapping(value = "/{chassiId}")
    public ResponseEntity<Car> getById(@PathVariable(name = "chassiId") String chassisId) {
        Optional<Car> car = Optional.ofNullable(carService.getById(Long.valueOf(chassisId)));
        return car.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> save(@Valid @RequestBody CarRequestDTO car) {
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(car));
    }
}
