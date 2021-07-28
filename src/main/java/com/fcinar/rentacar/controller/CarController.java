package com.fcinar.rentacar.controller;

import com.fcinar.rentacar.dto.CreateCarRequest;
import com.fcinar.rentacar.model.Car;
import com.fcinar.rentacar.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carService.getAllCars();
        return ResponseEntity.ok(cars);
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody CreateCarRequest createCarRequest) {
        return ResponseEntity.ok(carService.createCar(createCarRequest));
    }
}
