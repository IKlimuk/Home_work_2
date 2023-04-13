package com.ua.robotd.homework24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter number: ");

        while (true) {

            try {
                if (getNumber()) {
                    System.out.println("You have entered the correct value!");
                    break;
                }
            } catch (DontCorrect e) {
                System.out.println("You entered an incorrect value. Try again!!!");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }

    private static boolean getNumber() throws DontCorrect {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.hasNextInt();
        } else throw new DontCorrect();
    }
}
