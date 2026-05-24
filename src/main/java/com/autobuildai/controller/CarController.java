package com.autobuildai.controller;

import com.autobuildai.model.Car;
import com.autobuildai.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        return service.save(car);
    }
}
