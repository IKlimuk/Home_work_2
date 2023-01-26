package com.ua.robotd.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numberOne = number.nextInt();
        System.out.print("Enter second number: ");
        int numberTwo = number.nextInt();

// finding the maximum number
        if (numberOne > numberTwo) {
            System.out.println("The maximum number: " + numberOne);
        } else if (numberOne == numberTwo) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The maximum number: " + numberTwo);
        }

// finding the minimum number
        if (numberOne > numberTwo) {
            System.out.println("The minimum number: " + numberTwo);
        } else if (numberOne < numberTwo) {
            System.out.println("The minimum number: " + numberOne);
        }
        //checking the number for parity
        Scanner number2 = new Scanner(System.in);
        System.out.print("Enter a number to check for parity: ");
        int numberParity = number2.nextInt();
        if (numberParity % 2 == 0) {
            System.out.println(numberParity + " - A paired number");
        } else {
            System.out.println(numberParity + " - Not a paired number");
        }
    }
}
