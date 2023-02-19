package com.ua.robotd.homework10;

import java.util.Random;

public class ArrForWork {
    private int arrLength;

    public int[] newArrWithRandomNumber(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
    public int[] sortArrStraight(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }

        return arr;
    }

    public int[] sortArrBack(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }

        return arr;
    }

    public void printArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
    }

    public int getArrLength() {
        return arrLength;
    }

    public void setArrLength(int arrLength) {
        this.arrLength = arrLength;
    }
}
