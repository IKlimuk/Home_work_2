package com.ua.robotd.homework25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        try {
            numberSquared(x);
        } catch (NumberLessThanZero e) {
            System.out.println("You entered not correct number!");
            e.printStackTrace();
        }
    }

    private static void numberSquared(int x) throws NumberLessThanZero {
        if (x >= 0) {
            int xSquared = x * x;
            System.out.println("Squared number: " + x + " is equal to: " + xSquared);
        } else throw new NumberLessThanZero();
    }
}
