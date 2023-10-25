package org.example.Filereadandwrite;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String sentenceToWrite = " Hello and Welcome ! " + "\r" + " How are you doing today ? "  ;


        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(sentenceToWrite);

            fileWriter.close();
            System.out.println("The sentence has been written to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

