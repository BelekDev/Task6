package web.service;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarsService {
    private List<Cars> cars;

    public CarsService() {
        cars = new ArrayList<>();
        cars.add(new Cars("Toyota", "Camry", 2020));
        cars.add(new Cars("Honda", "Civic", 2019));
        cars.add(new Cars("Ford", "Mustang", 2018));
        cars.add(new Cars("Chevrolet", "Cruze", 2017));
        cars.add(new Cars("Tesla", "Model S", 2019));
    }

    public List<Cars> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}