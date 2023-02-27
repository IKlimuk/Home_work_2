package com.ua.robotd.homework14;

public class Main {
    public static void main(String[] args) {

        Person bob = new Student("Bob", "Granden", 2);
        Person ron = new Teacher("Ron", "Bilbon", "history");
        Student kate = new Student("Kate", "Rik", 4);
        Person[] one = {bob, ron, kate};
        for (Person pers : one) {
            pers.startLesson();
        }

        kate.setNumberCourse(3);
        System.out.println(kate.getNumberCourse());
        kate.startLesson();

    }
}
