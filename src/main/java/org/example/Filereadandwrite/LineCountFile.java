package org.example.Filereadandwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountFile {
    public static void main(String[] args) {
        String fileName = "/Users/saivelamuri/Desktop/input.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int lineCount = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
            }

            bufferedReader.close();

            System.out.println("Total number of lines: " + lineCount);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

