package com.ua.robotd.homework14;

public class Teacher extends Person {
    private String name;
    private String lastName;
    private String subjects;

    public Teacher(String name, String lastName, String subjects) {
        this.name = name;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    @Override
    public void startLesson() {
        System.out.println(name + " " + lastName + " starts teaching the " + subjects);

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

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
