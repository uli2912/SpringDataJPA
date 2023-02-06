package kg.itschoolmegacom.carservice.controllers;

import kg.itschoolmegacom.carservice.models.entity.Car;
import kg.itschoolmegacom.carservice.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/save")
    public Car save(@RequestBody Car car) {
        return carService.save(car);
    }

    @GetMapping("/list")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PutMapping("/update")
    public Car update(@RequestBody Car car){
        return carService.update(car);

    }

    @GetMapping("/min")
    public List<Car> minPrice(){
        return carService.minPrice();
    }
}
