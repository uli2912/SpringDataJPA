package kg.itschoolmegacom.carservice.service;

import kg.itschoolmegacom.carservice.models.entity.Car;

import java.util.List;

public interface CarService {

    Car save(Car car);

    List<Car> getCars();

    List<Car> minPrice();

    Car update(Car car);
}
