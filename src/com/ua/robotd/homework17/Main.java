package com.ua.robotd.homework17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DayOfWeek one = DayOfWeek.MONDAY;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week number from 1 to 7");
        int number = scanner.nextInt();
        while (number > 7) {
            System.out.println("Enter the day of the week number from 1 to 7 correctly!!!");
            number = scanner.nextInt();
        }
        if (number > 0 && number <= 7) {
            for (DayOfWeek i : DayOfWeek.values()) {
                if (i.getNumberOfDayOfWeek() == number) {
                    System.out.println(i);
                }
            }
        }

        // ------ the end program ---------------------------------
// ------ not for verification ---------------------------------

        Abstrac<Integer> ineg = new Abstrac<>();
        Abstrac<String> strin = new Abstrac<>(new String[]{"qq", "ss", "ccc"});
        ineg.setArray(new Integer[]{1, 3, 5, 2, 1, 4, 5});
        ineg.printAr();
        strin.printAr();
        System.out.println();
        System.out.println("_____");
        System.out.println();
        int a = 5;
        Integer b = 445;
        Double c = 7343.0;
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        String f = "dsf";
        System.out.println(f.hashCode());

        String g = "30.1111";
        c = Double.valueOf(g);
        System.out.println(b.getClass());

        System.out.println("!w" + (c * c));

        if (a > c) {
            System.out.println("!!!!!");
        } else System.out.println("((((((");
    }
}
