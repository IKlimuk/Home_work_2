package com.ua.robotd.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int add;
        int subtr;
        int mult;
        int div;
        System.out.println("Addition: " + (add = a + b));
        subtr = b - a;
        System.out.println("Subtraction: " + subtr);
        Scanner one = new Scanner(System.in);
        System.out.print("Enter c: ");
        int c = one.nextInt();
        Scanner two = new Scanner(System.in);
        System.out.print("Enter d: ");
        int d = one.nextInt();
        System.out.println("Multiplication: " + (mult = c * d));
        System.out.println("Division: " + (div = c / d));
    }
}
