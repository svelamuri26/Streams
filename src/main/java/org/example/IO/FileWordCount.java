package org.example.IO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWordCount {
    public static void main(String[] args) {
        String inputFileName = "/Users/saivelamuri/Desktop/demo.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/saivelamuri/Desktop/demo.txt"))) {
            String line;
            int wordCount = 0;

                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+");

                    for (String word : words) {
                        if (!word.isEmpty()) {
                            wordCount++;
                        }
                    }
                }

                System.out.println("Total word count: " + wordCount);
            } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

    }
}
