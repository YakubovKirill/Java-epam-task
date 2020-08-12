package by.epam.learn.fundomental;

import java.util.Scanner;

public class MainTaskFundomental {
    public static void main(String[] args) {
        System.out.println("Hello !" + '\n' + "Enter Your name :");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, " + name + " !");
        in.close();
    }
}
