package kg.itschoolmegacom.carservice.service.impl;

import kg.itschoolmegacom.carservice.models.entity.Car;
import kg.itschoolmegacom.carservice.repository.CarRepository;
import kg.itschoolmegacom.carservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    public final CarRepository carRepository;


    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    //insert into cars(
    // manufacturer, model, year, color, price, volume, horse_power)
    // values(?,?,?,?,?,?,?)
    @Override
    public Car save(Car car) {
        System.out.println("Before");
        car = carRepository.save(car);

        System.out.println("__________________");
        System.out.println("After save");
        System.out.println(car);

        return car;
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> minPrice() {
        Car car = carRepository.findAll().stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElseThrow(NoSuchElementException::new);
        return carRepository.findAll();

    }

    @Override
    public Car update(Car car) {
        return carRepository.save(car);
    }


}
