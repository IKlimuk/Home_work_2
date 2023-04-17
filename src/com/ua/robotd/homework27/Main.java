package com.ua.robotd.homework27;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String AD = "hello.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        WorkWithFile workWithFile = new WorkWithFile();
        workWithFile.writeToFile(text);
        workWithFile.readFromFile();

        // the end program
        //not for verification
        OutputStream f1 = null;

        try {
            f1 = new FileOutputStream(AD);
            String s1 = "Hello World!!!!dfgdfgdfgdfgdfgdf dfgdfg dfdfg dfgdfg!!!!";
            // OutputStreamWriter f2 = new OutputStreamWriter(f1);
            f1.write(s1.getBytes());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                f1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            char[] ar = new char[100];
            try {
                FileInputStream r1 = new FileInputStream(AD);
                InputStreamReader r2 = new InputStreamReader(r1);
                r2.read(ar);
                System.out.println(ar);
                for (char i : ar) {
                    if (i != 0) {
                        System.out.print(i);
                    }
                }
                r1.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
