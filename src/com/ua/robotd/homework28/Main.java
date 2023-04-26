package com.ua.robotd.homework28;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Path pathWrite = Path.of("file_to_write28.txt");

        WorkWithFileNio workWithFileNio = new WorkWithFileNio();
        workWithFileNio.writeToFile(pathWrite, text);
        workWithFileNio.readFromFile(pathWrite);
    }
}
