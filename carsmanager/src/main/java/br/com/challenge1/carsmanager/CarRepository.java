package br.com.challenge1.carsmanager;

import br.com.challenge1.carsmanager.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByChassisId(String chassisId);
}
