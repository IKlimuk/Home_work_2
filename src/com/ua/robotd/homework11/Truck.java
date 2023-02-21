package com.ua.robotd.homework11;

public class Truck extends Car {
    protected int fuelConsumptionPer100Kilometers;

    public String carDrive(int fuelConsumptionForTheEntireTrip) {
        super.carDrive();
        int fuelConsumption = fuelConsumptionForTheEntireTrip * fuelConsumptionPer100Kilometers;
        return ". The car consumed " + fuelConsumption + " liters of fuel.";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "fuelConsumptionPer100Kilometers=" + fuelConsumptionPer100Kilometers +
                ", color='" + color + '\'' +
                ", wheelDiameter=" + wheelDiameter +
                '}';
    }

    public Truck() {

    }

    public Truck(String color, int wheelDiameter, int fuelConsumptionPer100Kilometers) {
        super(color, wheelDiameter);
        this.fuelConsumptionPer100Kilometers = fuelConsumptionPer100Kilometers;
    }

    public int getFuelConsumptionPer100Kilometers() {
        return fuelConsumptionPer100Kilometers;
    }

    public void setFuelConsumptionPer100Kilometers(int fuelConsumptionPer100Kilometers) {
        this.fuelConsumptionPer100Kilometers = fuelConsumptionPer100Kilometers;
    }
}
