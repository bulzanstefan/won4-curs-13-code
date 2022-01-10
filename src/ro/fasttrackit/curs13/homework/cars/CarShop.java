package ro.fasttrackit.curs13.homework.cars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarShop {
    private final List<Car> cars = new ArrayList<>();

    public CarShop(Car... cars) {
        this(List.of(cars));
    }

    public CarShop(List<Car> cars) {
        if (cars != null) {
            this.cars.addAll(cars);
        }
    }

    public Map<String, Integer> countCars() {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : this.cars) {
            Integer crtCount = result.getOrDefault(car.name(), 0);
            result.put(car.name(), crtCount + 1);
        }
        return result;
    }

    public Map<Range, List<Car>> groupByKm(List<Range> ranges) {
        Map<Range, List<Car>> result = new HashMap<>();
        for (Car car : cars) {
            Range carRange = findRange(ranges, car);
            List<Car> carsForRange = result.get(carRange);
            if (carsForRange == null) {
                carsForRange = new ArrayList<>();
                result.put(carRange, carsForRange);
            }
            carsForRange.add(car);
        }
        return result;
    }

    private Range findRange(List<Range> ranges, Car car) {
        for (Range range : ranges) {
            if (range.matches(car.km())) {
                return range;
            }
        }
        return new Range(ranges.get(0).min(), Integer.MAX_VALUE);
    }
}
