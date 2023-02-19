package com.ua.robotd.homework11;

public class PassengerCar extends Car {

    protected int numberOfPassengerSeats;
    protected String typeOfFuel;

    @Override
    public void carDrive() {
        super.carDrive();
        System.out.println(". Car have " + getNumberOfPassengerSeats() + " passenger seats and fuel is " + getTypeOfFuel());
    }

    public PassengerCar() {

    }

    public PassengerCar(int numberOfPassengerSeats, String typeOfFuel) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
        this.typeOfFuel = typeOfFuel;
    }

    public PassengerCar(String color, int wheelDiameter, int numberOfPassengerSeats, String typeOfFuel) {
        super(color, wheelDiameter);
        this.numberOfPassengerSeats = numberOfPassengerSeats;
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "numberOfPassengerSeats=" + numberOfPassengerSeats +
                ", typeOfFuel='" + typeOfFuel + '\'' +
                ", color='" + color + '\'' +
                ", wheelDiameter=" + wheelDiameter +
                '}';
    }

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }

    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
