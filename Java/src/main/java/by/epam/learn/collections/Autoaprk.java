package by.epam.learn.collections;

import by.epam.learn.collections.action.CarAction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Autoaprk {
    public static void main(String[] args) {
        ArrayList<Car> autoPark = new ArrayList<Car>() {
            {
                add(new Car(1, "Car1", 120, 8, 9.5, 20_000));
                add(new Car(2, "Car2", 150, 4, 6.2, 17_000));
                add(new Car(3, "Car3", 200, 4, 10.0, 25_000));
                add(new Car(4, "Car4", 220, 4, 9.7, 18_000));
                add(new Car(5, "Car5", 160, 6, 7.2, 15_000));
                add(new Car(6, "Car6", 180, 5, 8.0, 19_000));
                add(new Car(7, "Car7", 250, 4, 13.0, 40_000));
                add(new Car(8, "Car8", 110, 8, 8.4, 22_000));
                add(new Car(9, "Car9", 120, 7, 6.0, 18_000));
                add(new Car(10, "Car10", 230, 4, 10.7, 50_000));
            }
        };

        System.out.println("------- Auto park before sorting --------");
        CarAction.printCarList(autoPark);
        System.out.println();

        System.out.println("Total auto park cost = " + CarAction.getAutoParkCost(autoPark));
        System.out.println();

        System.out.println("------- Auto park sorted by fuel rate --------");
        autoPark.sort(Comparator.comparing(Car::getFuelRate));
        CarAction.printCarList(autoPark);
        System.out.println();

        System.out.println("Enter speed range from");
        Scanner in = new Scanner(System.in);
        int speedRangeFrom = in.nextInt();
        System.out.println("Enter speed range to");
        int speedRangeTo = in.nextInt();
        in.close();

        System.out.println("------- Cars with ranged speed --------");
        CarAction.printCarList(CarAction.getCarsFromSpeedRange(autoPark, speedRangeFrom, speedRangeTo));

    }
}
