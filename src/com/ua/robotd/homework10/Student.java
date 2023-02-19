package com.ua.robotd.homework10;

public class Student {
    private String name;
    private String lastName;
    private int numberCourse;

    public void learn() {
        System.out.println(name + " " + lastName + " " + "begins to learn at course number " + numberCourse);
    }

    public Student() {
    }

    public Student(String name, String lastName, int numberCourse) {
        this.name = name;
        this.lastName = lastName;
        this.numberCourse = numberCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberCourse=" + numberCourse +
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

    public int getNumberCourse() {
        return numberCourse;
    }

    public void setNumberCourse(int numberCourse) {
        if ((numberCourse > 0) && (numberCourse < 6)) {
            this.numberCourse = numberCourse;
        } else System.out.println("Wrong!!!");
    }

}
