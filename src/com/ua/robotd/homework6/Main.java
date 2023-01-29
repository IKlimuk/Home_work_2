package com.ua.robotd.homework6;

public class Main {
    public static void main(String[] args) {
        // 1. Output of numbers from 1 to 10
        System.out.print("1. Numbers from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        //2. Output of even numbers from 1 to 100
        System.out.println();
        System.out.print("2. Even numbers from 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //3.  Derivation of the factorial of a number
        System.out.println();
        int number = 7;
        int factorialOfNumber = 1;
        for (int i = 1; i <= number; i++) {
            factorialOfNumber *= i;
        }
        System.out.print("3. Factorial of the number " + number + ": " + factorialOfNumber);
        //4. Derivation of Fibonacci numbers from 1 to 100
        System.out.println();
        int f0 = 0;
        int f1 = 1;
        int fn;
        System.out.print("4. Fibonacci numbers: " + f0 + " " + f1 + " ");
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
