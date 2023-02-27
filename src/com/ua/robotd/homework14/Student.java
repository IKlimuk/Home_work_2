package com.ua.robotd.homework14;

public class Student extends Person {

    private String name;
    private String lastName;
    private int numberCourse;

    @Override
    public void startLesson() {
        System.out.println(name + " " + lastName + " begins studies in the  " + numberCourse + " year");
    }

    public Student(String name, String lastName, int numberCourse) {
        this.name = name;
        this.lastName = lastName;
        this.numberCourse = numberCourse;
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
        this.numberCourse = numberCourse;
    }
}
