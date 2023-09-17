package br.com.challenge1.carsmanager.controller;
import br.com.challenge1.carsmanager.entity.Car;
import br.com.challenge1.carsmanager.service.CarService;
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
    public ResponseEntity<Optional<Car>> getById(@PathVariable(name = "chassiId") String chassisId) {
        var response = carService.getById(Long.valueOf(chassisId));
        return ResponseEntity.ok(Optional.ofNullable(response));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Car> save(@RequestBody Car car) {
        Car savedCar = carService.save(car);
        if (savedCar != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(savedCar);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

}
