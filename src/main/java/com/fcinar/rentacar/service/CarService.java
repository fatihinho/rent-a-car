package com.fcinar.rentacar.service;

import com.fcinar.rentacar.dto.CreateCarRequest;
import com.fcinar.rentacar.model.Car;
import com.fcinar.rentacar.repository.ICarRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final ICarRepository carRepository;

    public CarService(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car createCar(@NotNull CreateCarRequest createCarRequest) {
        Car car = new Car(createCarRequest.getName(), createCarRequest.getModel(), createCarRequest.getAmountPerHour());
        return carRepository.save(car);
    }
}
