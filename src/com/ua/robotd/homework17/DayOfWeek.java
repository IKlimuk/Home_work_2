package com.ua.robotd.homework17;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int numberOfDayOfWeek;

    public int getNumberOfDayOfWeek() {
        return numberOfDayOfWeek;
    }

    public void setNumberOfDayOfWeek(int numberOfDayOfWeek) {
        this.numberOfDayOfWeek = numberOfDayOfWeek;
    }

    DayOfWeek() {
    }

    DayOfWeek(int numberOfDayOfWeek) {
        this.numberOfDayOfWeek = numberOfDayOfWeek;
    }
}

