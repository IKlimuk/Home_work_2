package com.ua.robotd.homework27;

import java.io.*;

public class WorkWithFile {
    public static final String FILE_NAME = "file_to_write.txt";

    public void writeToFile(String text) {
        try (OutputStream wr = new FileOutputStream(FILE_NAME);
             OutputStreamWriter wrInFile = new OutputStreamWriter(wr)) {
            wrInFile.write(text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromFile() {
        char[] arr = new char[100];
        try (InputStream rd = new FileInputStream(FILE_NAME);
             InputStreamReader rdFromFile = new InputStreamReader(rd)) {
            rdFromFile.read(arr);
            StringBuilder textBilder = new StringBuilder();
            for (char i : arr) {
                if (i != 0) {
                    textBilder.append(i);
                }
            }

            String text = textBilder.toString();
            System.out.println("Text from the file: " + text);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
