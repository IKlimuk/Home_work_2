package com.ua.robotd.homework33;

import java.util.Random;

public class Thread33 extends Thread {


    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(1, 10);
            try {
                Thread.sleep(100);
                if (number == 5) {
                    Thread.currentThread().interrupt();
//                    System.out.println("Thread finished " + Thread.currentThread().getName());
                    // break;
                }
                System.out.println("Number of  " + Thread.currentThread().getName() + " :" + number);
            } catch (InterruptedException e) {
                System.out.println("Thread finished " + Thread.currentThread().getName());
                throw new RuntimeException(e);
            }
        }
    }
}
