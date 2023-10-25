package org.example.Filereadandwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SumCalculationFile {
    public static void main(String[] args) {
        String inputFileName = "/Users/saivelamuri/Desktop/input_numbers.txt";
        String outputFileName = "output_sum.txt";

        try {
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(outputFileName);

            String line;
            int sum = 0;

            while ((line = bufferedReader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.err.println("Skipping non-integer value: " + line);
                }
            }


            bufferedReader.close();
            fileReader.close();


            fileWriter.write("Sum of the numbers: " + sum);
            fileWriter.close();

            System.out.println("Sum of the numbers has been written to " + outputFileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
