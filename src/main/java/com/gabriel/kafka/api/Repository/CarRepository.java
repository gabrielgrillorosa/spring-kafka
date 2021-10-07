package com.gabriel.kafka.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.gabriel.kafka.api.model.Car;

@Service
public interface CarRepository extends JpaRepository<Car, Long> {

}
