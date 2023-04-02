package com.ua.robotd.homework22;

import java.util.Random;

public class Student22 implements Comparable{
    private String name;
    private String lastName;
    private int gradePointAverage;


    public Student22() {
        this.name = generait(4);
        this.lastName = generait(5);
        this.gradePointAverage = (int) (Math.random() * 12);

    }

    public String generait(int nameSize) {
        String alphavit = "abcdefghijklmnopqrstuvxyz";
        Random random = new Random();
        StringBuilder newN = new StringBuilder();
        int a = random.nextInt(1, 3);
        for (int i = 0; i < nameSize; i++) {
            for (int j = 0; j < a; j++) {
                newN.append(alphavit.charAt(random.nextInt(0, alphavit.length())));
            }
        }
        String gener = newN.toString();
        gener = uperCase(gener, 0);
        return gener;
    }

    public String uperCase(String inputWord, int numberUpCase) {
        StringBuilder word = new StringBuilder();
        char[] c = inputWord.toCharArray();
        for (int i = 0; i < inputWord.length(); i++) {
            if (i == numberUpCase) {
                char a = Character.toUpperCase(c[i]);
                c[i] = a;
            }
            word.append(c[i]);
        }
        return word.toString();
    }


    public String toString() {
        return "Student22{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradePointAverage=" + gradePointAverage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(int gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public Student22(String name, String lastName, int gradePointAverage) {
        this.name = name;
        this.lastName = lastName;
        this.gradePointAverage = gradePointAverage;
    }


    public int compareTo(Student22 o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
