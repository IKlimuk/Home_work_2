package com.ua.robotd.homework34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Callable<Integer>> callables = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            callables.add(new ThreadRandomNumber());
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futures = executorService.invokeAll(callables);
        for (Future<Integer> i : futures) {
            System.out.println(Thread.currentThread().getName() + " - " + i.get());
        }
        executorService.shutdown();
    }
}
