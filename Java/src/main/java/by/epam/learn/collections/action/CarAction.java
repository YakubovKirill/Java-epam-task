package by.epam.learn.collections.action;

import by.epam.learn.collections.Car;

import java.util.ArrayList;

public class CarAction {
    public static void printCarList (ArrayList<Car> cars) {
        cars.forEach(car -> System.out.println(car.toString()));
    }

    public static int getAutoParkCost (ArrayList<Car> cars) {
        int totalAutoParkCost = 0;
        for (Car car:cars) {
            totalAutoParkCost += car.getCarCost();
        }
        return totalAutoParkCost;
    }

    public static ArrayList<Car> getCarsFromSpeedRange(ArrayList<Car> cars, int rangeSpeedFrom, int rangeSpeedTo) {
        ArrayList<Car> carsWithRangedSpeed = new ArrayList<>();
        for (Car car:cars) {
            if (car.getMaxSpeed() >= rangeSpeedFrom && car.getMaxSpeed() <= rangeSpeedTo) {
                carsWithRangedSpeed.add(car);
            }
        }
        return carsWithRangedSpeed;
    }
}
