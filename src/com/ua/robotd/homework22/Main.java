package com.ua.robotd.homework22;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student22> groupFirst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            groupFirst.add(new Student22());
        }
        Student22 s1 = new Student22("Aria", "Abron", 12);
        groupFirst.add(s1);

        List<Student22> groupFirstSortGPA = groupFirst.stream()
                .sorted(Comparator.comparing(Student22::getGradePointAverage)).toList();

        List<Student22> groupFirstSortLastName = groupFirst.stream()
                .sorted(Comparator.comparing(Student22::getLastName)).toList();

        printtList(groupFirst);
        printtList(groupFirstSortGPA);
        printtList(groupFirstSortLastName);


        System.out.println("|||||||||||||||||||||||||||||||||||");
        //  second var

        List<Student22> groupSecond = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            groupSecond.add(new Student22());
        }

        Collections.sort(groupSecond, new Comparator<Student22>() {
            public int compare(Student22 s1, Student22 s2) {
                Integer a1 = s1.getGradePointAverage();
                Integer a2 = s2.getGradePointAverage();
                return a1.compareTo(a2);
            }
        });
        printtList(groupSecond);

        Collections.sort(groupSecond, ((o1, o2) -> o1.getLastName().compareTo(o2.getLastName())));
        printtList(groupSecond);

        groupSecond.sort(Comparator.comparing(Student22::getName));
        printtList(groupSecond);

    }

    private static void printtList(List<Student22> stud) {
        int a = 1;
        for (Student22 i : stud) {
            System.out.println(a + ". " + i);
            a++;
        }
        System.out.println("__________________________________");
    }
}
