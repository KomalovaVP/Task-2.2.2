package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    public List<Car> getCars(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 333, "silver"));
        carList.add(new Car("Mazda", 323, "grey"));
        carList.add(new Car("Lada", 999, "black"));
        carList.add(new Car("Jeep", 599, "red"));
        carList.add(new Car("Lexus", 777, "white"));
        switch (count) {
            case 1:
                return carList.stream().limit(1).toList();
            case 2:
                return carList.stream().limit(2).toList();
            case 3:
                return carList.stream().limit(3).toList();
            case 4:
                return carList.stream().limit(4).toList();
            default:
                return carList;
        }
    }
}