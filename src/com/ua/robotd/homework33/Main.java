package com.ua.robotd.homework33;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread33 t1 = new Thread33();
            Thread thread = new Thread(t1);
            thread.start();
        }
    }
}
