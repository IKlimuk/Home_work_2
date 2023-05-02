package com.ua.robotd.homework32;

public class ThreadFirst extends Thread {
    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("First thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}