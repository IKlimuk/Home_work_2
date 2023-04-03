package com.ua.robotd.homework23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1.

        List<String> listLastNames20 = new ArrayList<>();
        int i;
        for (i = 0; i < 20; i++) {
            listLastNames20.add(getLastName());
        }
        System.out.println(listLastNames20);

        int finalI = i;
        Map<String, Long> newListLastNames = listLastNames20.stream()
                .collect(Collectors.groupingBy(String::intern, Collectors.counting()));

        System.out.println(newListLastNames);

        // 2.
        List<Integer> listNumbers = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            Random random = new Random();
            listNumbers.add(random.nextInt(0, 100));

        }
        System.out.println(listNumbers);
        int sum1 = listNumbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum1);

        int sum2 = listNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);
    }

    public static String getLastName() {
        String l1 = "Robruj";
        String l2 = "Banhu";
        String l3 = "Porkmn";
        String l4 = "Cbopmu";
        String l5 = "Vityb";
        String l6 = "Syertb";
        String l7 = "Lopuyg";
        String[] lastNames = {l1, l2, l3, l4, l5, l6, l7};

        Random random = new Random();
        int a = random.nextInt(0, lastNames.length);
        return lastNames[a];

    }
}
