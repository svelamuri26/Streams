package org.example.IO;

//Creating Directories
//Create a program that allows users to specify a path, and the program should create
// a directory at that specified location.
import java.io.File;

public class CreatingDirectories {
    public static void main(String[] args) {

        String directoryPath = "/Users/saivelamuri/Desktop/myDirectory";

        File directory = new File("/Users/saivelamuri/Desktop/myDirectory");

        if (directory.exists()) {
            System.out.println("Directory already exists.");
        } else {
            boolean directoryCreated = directory.mkdirs();

            if (directoryCreated) {
                System.out.println("Directory created successfully at: " + directory.getAbsolutePath());
            } else {
                System.err.println("Failed to create the directory.");
            }
        }
    }
}
