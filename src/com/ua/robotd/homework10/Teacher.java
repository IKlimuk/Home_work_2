package com.ua.robotd.homework10;

public class Teacher {
    private String name;
    private String lastName;
    private String subjects;
    private int hourWorkOfWeek;

    public void startToTeach() {

        System.out.println(name + " " + lastName + " start teaching");
    }

    public Teacher(String name, String lastName, String subjects, int hourWorkOfWeek) {
        this.name = name;
        this.lastName = lastName;
        this.subjects = subjects;
        this.hourWorkOfWeek = hourWorkOfWeek;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjects='" + subjects + '\'' +
                ", hourWorkOfWeek=" + hourWorkOfWeek +
                '}';
    }

    public int getHourWorkOfWeek() {
        return hourWorkOfWeek;
    }

    public void setHourWorkOfWeek(int hourWorkOfWeek) {
        this.hourWorkOfWeek = hourWorkOfWeek;
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
