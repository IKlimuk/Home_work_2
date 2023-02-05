package com.ua.robotd.homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1.
        int lengthArray = 10;
        int range = 100;
        int[] array = new int[lengthArray];
        arrayRandomNumbers(array, range);
        // 2.
        printArray(array);
        // 3.
        findAndPrintMinValue(array);
        // 4.
        findAndPrintMaxValue(array);
        // 5.
        findAndPrintTheAverageValue(array);
        // 6.
        findAndPrintSumArray(array);
    }

    // 1.
    static void arrayRandomNumbers(int[] array, int range) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range);
        }
    }

    // 2.
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // 3.
    static void findAndPrintMinValue(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("The minimum value of the array: " + minValue);
    }

    // 4.
    static void findAndPrintMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("The maximum value of the array: " + maxValue);
    }

    // 5.
    static void findAndPrintTheAverageValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int averageOfArr = sum / arr.length;
        System.out.println("The average value of the array: " + averageOfArr);
    }

    // 6.
    static void findAndPrintSumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum value of the array: " + sum);
    }
}
