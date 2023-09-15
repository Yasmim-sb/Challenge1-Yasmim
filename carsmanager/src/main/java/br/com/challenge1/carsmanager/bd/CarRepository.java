package br.com.challenge1.carsmanager.bd;

import br.com.challenge1.carsmanager.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByChassisId(Long chassisId);
}
