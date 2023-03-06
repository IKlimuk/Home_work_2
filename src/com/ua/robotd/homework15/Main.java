package com.ua.robotd.homework15;

public class Main {
    public static void main(String[] args) {

        Flying p1 = new Pilot();
        p1.fly();

        Driving d1 = new Driver();
        d1.drive();

        Person p2 = new Driver("Jon", "Fit", 45);
        p2.old = 46;
        System.out.println(p2.toString());
        p2.eat();
        System.out.println();

        Driver d2 = new Driver("Wim", "Dert", 35);
        d2.eat();
        d2.drive();

    }
}
