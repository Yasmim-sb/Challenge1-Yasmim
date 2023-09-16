package br.com.challenge1.carsmanager.repository;

import br.com.challenge1.carsmanager.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface CarRepository extends JpaRepository<Car, Long> {
}
