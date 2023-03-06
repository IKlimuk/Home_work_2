package com.ua.robotd.homework15;

public class Pilot extends Person implements Flying, Driving {

    public Pilot() {
    }

    @Override
    public void fly() {
        System.out.println("pilot can fly");
    }

    @Override
    public void drive() {
        System.out.println("pilot may drive a lot");

    }

    public Pilot(String firsName, String lastName, int old) {
        super(firsName, lastName, old);
    }
}
