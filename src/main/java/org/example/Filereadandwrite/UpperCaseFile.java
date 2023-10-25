package org.example.Filereadandwrite;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperCaseFile {
    public static void main(String[] args) {
        String inputFileName = "/Users/saivelamuri/Desktop/input.txt";
        String outputFileName = "output.txt";

        try {
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(outputFileName);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String upperCaseLine = line.toUpperCase();
                fileWriter.write(upperCaseLine + "\n");
            }

            bufferedReader.close();
            fileWriter.close();

            System.out.println("Text converted to uppercase and saved to " + outputFileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

