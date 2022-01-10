package ro.fasttrackit.curs13.homework.cars;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(
                new Car("Audi", 3, 20000, 20001),
                new Car("BMW", 2, 210000, 2001),
                new Car("Audi", 7, 200000, 1252),
                new Car("Mercedes", 6, 320000, 14000),
                new Car("BMW", 2, 14000, 20000),
                new Car("BMW", 13, 16000, 20000)
        );

        System.out.println(carShop.countCars());
        System.out.println(carShop.groupByKm(List.of(
                new Range(0, 10000),
                new Range(10000, 50000),
                new Range(50000, 100000),
                new Range(100000, Integer.MAX_VALUE)
        )));
    }
}
