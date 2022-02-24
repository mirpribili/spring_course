package com.raw.black_belt.nbb005_lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Nbb37Consumer {
    public static void main(String[] args) {
        ArrayList<Car> cars =
                Nbb36Supplier.createThreeCars(()->new Car("Nissan Tiida", "Silver Metalic", 1.6));
        changeCar(cars.get(0),car -> {
            car.color = "red";
            car.engine = 2;
            System.out.println("Upgrated car: " + car);
        });
    }
    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }
}
