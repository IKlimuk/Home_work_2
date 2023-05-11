package com.ua.robotd.homework34;

import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadRandomNumber implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int numberRandom = random.nextInt(1,50);
        Thread.sleep(1000);
        return numberRandom;
    }
}
