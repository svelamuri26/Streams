package org.example.Filereadandwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadandWriteFile {
    public static void main(String[] args) {
        String sourceFileName = "/Users/saivelamuri/Desktop/source.txt";
        String destinationFileName = "destination.txt";

        try {
            FileReader fileReader = new FileReader("/Users/saivelamuri/Desktop/source.txt");
            FileWriter fileWriter = new FileWriter("destination.txt");

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            fileReader.close();
            fileWriter.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
