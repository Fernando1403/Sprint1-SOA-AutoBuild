package com.autobuildai.service;

import com.autobuildai.model.Car;
import com.autobuildai.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> findAll() {
        return repository.findAll();
    }

    public Car save(Car car) {
        return repository.save(car);
    }
}
