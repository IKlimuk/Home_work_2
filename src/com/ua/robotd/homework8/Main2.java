package com.ua.robotd.homework8;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int[][] ar = new int[5][5];

        newArr (ar);
        sort(ar);
        sortBack(ar);


    }

    static void newArr(int[][] arrr) {
        Random ran = new Random();
        for (int i = 0; i < arrr.length; i++) {
            for (int j = 0; j < arrr[i].length; j++) {
                arrr[i][j] = ran.nextInt(10);
                System.out.print(arrr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void sort (int[][] arrr) {
        System.out.println();
        int j = 0;
        int sum = 0;
        for (int i = 0; i < arrr.length; i++) {
            System.out.print(arrr[i][j] + "\t");

            sum+=arrr[i][j];
            j++;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println();
    }
    static void sortBack (int[][] arrr) {
        int i = 0;
        int[] newBack = new int[arrr.length];
        for (int j = arrr.length-1; j >=0 ; j--) {
            System.out.println(arrr[i][j]);
            newBack[i]=arrr[i][j];
            i++;
     System.out.println(j);

        }

        for (int j = 0; j < newBack.length; j++) {
            System.out.print(newBack[j]);

        }

    }

}
