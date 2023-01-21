package com.ua.robotd.homework4;

public class Main {
    public static void main(String[] args) {
        String text = "I am learning Java";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        int last  = text.length();
        int lastnumber= last-1;
        System.out.print("First letter: " + text.charAt(0));
        System.out.print("Last letter: " + text.charAt(lastnumber));
    }
}
