package com.ua.robotd.homework11;

public class Car {
    protected String color;
    protected int wheelDiameter;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", wheelDiameter=" + wheelDiameter +
                '}';
    }

    public void carDrive () {
        System.out.print(getColor() + " car go away with wheels " + getWheelDiameter() + " size");
    }

    public Car () {

    }

    public Car(String color, int wheelDiameter) {
        this.color = color;
        this.wheelDiameter = wheelDiameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
}

