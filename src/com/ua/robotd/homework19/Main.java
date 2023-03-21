package com.ua.robotd.homework19;


import java.util.*;

public class Main implements Comparable<Student19> {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> array1 = new HashSet<>();
        Set<Integer> array2 = new LinkedHashSet<>();
        Set<Integer> array3 = new TreeSet<>();
        int numberFrom0To50;
        for (int i = 0; i < 1000; i++) {
            numberFrom0To50 = random.nextInt(1, 51);
            array1.add(numberFrom0To50);
            array2.add(numberFrom0To50);
            array3.add(numberFrom0To50);
        }

        System.out.println("1. HashSet: " + array1);
        System.out.println("2. LinkedHashSet: " + array2);
        System.out.println("3. TreeSet: " + array3);

        // the end homework


        Student19 s1 = new Student19("Jon", "Doms", 23, 4);
        Student19 s2 = new Student19("Bon", "Rebk", 21, 2);
        Student19 s3 = new Student19("Ran", "Nomsaw", 20, 1);
        Student19 s4 = new Student19("Sun", "Borumk", 19, 1);
        Student19 s5 = new Student19("Men", "Cyupor", 25, 6);
        List<Student19> studList = new ArrayList<>();

        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
        studList.add(s5);

        System.out.println(studList);

        studList.sort((o1, o2) -> {
            Integer a1 = o1.getAge();
            Integer a2 = o2.getAge();
            return a1.compareTo(a2);
        });

        Set<Student19> students = new TreeSet<>(studList);
        students.add(new Student19("Arnold", "Shwarz", 30, 1));
        System.out.println(students);

    }



    @Override
    public int compareTo(Student19 o) {
        return 0;
    }
}
