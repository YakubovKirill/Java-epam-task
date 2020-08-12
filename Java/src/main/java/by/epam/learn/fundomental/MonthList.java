package by.epam.learn.fundomental;

import java.util.Scanner;

public class MonthList {
    public static void main(String[] args) {
        System.out.println("Enter number of month 1-12");
        Scanner in = new Scanner(System.in);
        int monthNumber = in.nextInt();
        in.close();
        if ((monthNumber > 0) && (monthNumber <= 12)) {
            String[] months = new String[]{
                    "January",
                    "February",
                    "March",
                    "April",
                    "May",
                    "June",
                    "July",
                    "August",
                    "September",
                    "October",
                    "November",
                    "December"
            };
            System.out.println(months[monthNumber - 1]);
        } else {
            System.out.println("You enter wrong month number");
        }

    }
}
