package com.ua.robotd.homework15;

public class Driver extends Person implements Driving {


    public Driver() {
    }

    @Override
    public void drive() {
        System.out.println("driver can drive");

    }

    public Driver(String firsName, String lastName, int old) {
        super(firsName, lastName, old);
    }
}
