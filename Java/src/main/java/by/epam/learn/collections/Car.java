package by.epam.learn.collections;

import java.util.Objects;

public class Car {
    private int id;
    private int carCost;
    private double fuelRate;
    public String carName;
    public int maxSpeed;
    public int numberOfSeats;

    public Car() {}

    public Car(int id, String carName, int maxSpeed, int numberOfSeats, double fuelRate, int carCost) {
        this.id = id;
        this.carName = carName;
        this.maxSpeed = maxSpeed;
        this.numberOfSeats = numberOfSeats;
        this.fuelRate = fuelRate;
        this.carCost = carCost;
    }

    public int getId() {
        return id;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public int getCarCost() {
        return carCost;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car {" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carCost=" + carCost +
                ", fuelRate=" + fuelRate +
                ", maxSpeed=" + maxSpeed +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
