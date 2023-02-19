package com.ua.robotd.homework10;

public class Main {
    public static void main(String[] args) {
        Student Tom = new Student();
        Tom.setName("Tom");
        Tom.setLastName("Humen");
        Tom.setNumberCourse(2);
        Student Jek = new Student();
        Student Fill = new Student("Fill", "Deer", 3);

        System.out.println(Tom.toString());
        System.out.println(Jek.toString());
        System.out.println(Fill.toString());
        Tom.learn();

        Teacher Jon = new Teacher("Jon", "Reden", "physics", 20);
        System.out.println(Jon.toString());
        Jon.startToTeach();

        ArrForWork mass = new ArrForWork();
        mass.setArrLength(10);
        int[] newMasss = mass.newArrWithRandomNumber(mass.getArrLength());
        mass.printArr(newMasss);

        System.out.println();
        mass.sortArrStraight(newMasss);
        mass.printArr(newMasss);

        System.out.println();
        mass.sortArrBack(newMasss);
        mass.printArr(newMasss);

    }
}
