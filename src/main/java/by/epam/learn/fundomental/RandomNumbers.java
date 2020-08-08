package by.epam.learn.fundomental;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Enter count of random numbers \n");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        in.close();

        System.out.println("------ Numbers without switching ------");
        for (int i = 0; i < count; i++) {
            System.out.print((int)(Math.random() * 10) + " ");
        }
        System.out.println();

        System.out.println("------ Numbers with switching ------");
        for (int i = 0; i < count; i++) {
            System.out.println((int)(Math.random() * 10));
        }
    }
}
