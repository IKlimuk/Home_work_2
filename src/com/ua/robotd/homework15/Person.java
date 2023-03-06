package com.ua.robotd.homework15;

public class Person {
    protected String firsName;

    protected String lastName;
    protected int old;

    public void eat() {
        System.out.println("I am " + firsName + " " + lastName + ". I`m eating.");
    }


    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", old=" + old +
                '}';
    }

    public Person(String firsName, String lastName, int old) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.old = old;
    }

    public Person() {

    }

}
