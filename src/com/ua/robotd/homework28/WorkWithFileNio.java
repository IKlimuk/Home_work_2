package com.ua.robotd.homework28;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithFileNio {

    public void writeToFile(Path path, String text) throws IOException {
        byte[] bytesArr = text.getBytes();
        Files.write(path, bytesArr);
    }

    public void readFromFile(Path path) {
        byte[] bytesArr;
        try {
            bytesArr = Files.readAllBytes(path);
            String textHasRead = new String(bytesArr);
            System.out.println("Text is from file: " + textHasRead);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
