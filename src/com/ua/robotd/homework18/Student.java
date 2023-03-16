package com.ua.robotd.homework18;

public class Student {
    private String name;
    private String lastname;
    private int age;
    private int courseNumber;

    public void toLearn() {
        System.out.println("I`m " + name + " "+lastname+". I`m  " + age + " years old. " +
                "I study in the " + courseNumber + "th year.");
    }

    public Student(String name, String lastname, int age, int courseNumber) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.courseNumber = courseNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", courseNumber=" + courseNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
}
