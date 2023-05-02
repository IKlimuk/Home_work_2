package com.ua.robotd.homework32;

public class Main {
    public static void main(String[] args) {
        ThreadFirst t1 = new ThreadFirst();
        ThreadSecond t2 = new ThreadSecond();

        Thread threadFirst = new Thread(t1);
        Thread threadSecond = new Thread(t2);
        threadFirst.start();
        threadSecond.start();
    }
}
