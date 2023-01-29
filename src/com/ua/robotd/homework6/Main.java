package com.ua.robotd.homework6;

public class Main {
    public static void main(String[] args) {

        // 1. Оutput of numbers from 1 to 10
        System.out.print("1. Numbers from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // 2. Оutput of even numbers from 1 to 100
        System.out.println();
        System.out.print("2. Even number from 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // 3. Factorial of the number 7
        System.out.println();
        int number = 7;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("3. Factorial of the number " + number + ": " + factorial);

        // 4. Fibonacci number derivation
        System.out.print("4. Fibonacci: ");
        int f0 = 0;
        int f1 = 1;
        int fn;
        System.out.print(f0 + " " + f1 + " ");
        while (true) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            if (fn > 100) {
                break;
            }
            System.out.print(fn + " ");
        }
    }
}
