package org.example.IO;
//Appending to a File
//Create a program that allows the user to add more content to an existing file without
// overwriting its previous content.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) {
        String fileName = "demo.txt";

        try (FileWriter fileWriter = new FileWriter(fileName, true);
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter text to append to the file (type 'Exit' to finish):");

            while (true) {
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("Exit")) {
                    System.out.println("Append completed.");
                    break;
                } else {
                    fileWriter.write(userInput + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
