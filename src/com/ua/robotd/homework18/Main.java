package com.ua.robotd.homework18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // 1.
        List<Integer> numbers20 = new ArrayList<>();
        List<Integer> numbers2000000 = new LinkedList<>();
        int arraySize20 = 20;
        int arraySize2000000 = 2000000;
        Random random = new Random();

        for (int i = 0; i < arraySize20; i++) {
            int numberForListWith20Numbers = random.nextInt(1, 100);
            numbers20.add(numberForListWith20Numbers);
        }

        for (int i = 0; i < arraySize2000000; i++) {
            int numberForListWith2000000Numbers = random.nextInt(1, 100);
            numbers2000000.add(numberForListWith2000000Numbers);
        }

        System.out.println(numbers20);
        System.out.println(numbers20.size());
        System.out.println(numbers2000000.size());
        System.out.println(numbers2000000.get(random.nextInt(1, arraySize2000000)));

        //2.
        List<Student> student = new ArrayList<>();

        Student s1 = new Student("Jon", "Doms", 23, 4);
        Student s2 = new Student("Bon", "Rebk", 21, 2);
        Student s3 = new Student("Ran", "Nomsaw", 20, 1);
        Student s4 = new Student("Sun", "Borumk", 19, 1);
        Student s5 = new Student("Men", "Cyupor", 25, 6);
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);
        System.out.println(student.get(2));
        student.get(1).toLearn();
        System.out.println(student.size());
        Student s6 = new Student("Romoren", "Bikler", 30, 1);
        student.add(s6);
        System.out.println(student.size());
        System.out.println("____________________");

        //3.
        int sequenceNumber = 1;
        for (Student i : student) {
            System.out.println(sequenceNumber + ". " + i.toString());
            sequenceNumber++;
        }
    }
}
