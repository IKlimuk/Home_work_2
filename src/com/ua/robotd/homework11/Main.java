package com.ua.robotd.homework11;

public class Main {
    public static void main(String[] args) {

        Car one = new Car();
        one.color = "Blue";
        one.wheelDiameter = 15;
        Car two = new Car("Red", 15);

        System.out.println(one.color);
        System.out.println(two.getWheelDiameter());
        System.out.println(two.toString());

        one.carDrive();
        two.carDrive();

        PassengerCar pasat = new PassengerCar(4, "diesel");
        System.out.println(pasat.toString());

        PassengerCar daca = new PassengerCar("Dark", 16, 5, "gas");
        daca.setColor("White");
        System.out.println(daca.toString());

        daca.carDrive();

        Truck dat = new Truck();
        dat.setColor("Pink");
        dat.setWheelDiameter(27);
        System.out.println(dat.toString());
        dat.setFuelConsumptionPer100Kilometers(45);

        int pathLength = 500;

        System.out.println(dat.carDrive(pathLength));

    }
}
