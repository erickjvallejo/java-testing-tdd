package com.demotdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name) {

        List<Car> car = carRepository.findByName(name);

        if (car == null) {
            throw new CarNotFoundException();
        }
        return car.get(0);
    }
}
