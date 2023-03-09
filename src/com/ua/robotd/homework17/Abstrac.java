package com.ua.robotd.homework17;

// ------ not for verification ---------------------------------

public class Abstrac <T> {
private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public Abstrac() {
    }

    public Abstrac(T[] array) {
        this.array = array;
    }

    void printAr() {
        for (T i: array) {
            System.out.print(i+", ");
        }
    }
}
