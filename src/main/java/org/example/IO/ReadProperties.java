package org.example.IO;

// Reading a Properties File
//Create a program that reads key-value pairs from a .properties
// file and prints them to the console.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream("/Users/saivelamuri/Desktop/myFile.xml")) {
            properties.load(fis);


            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                System.out.println(key + ": " + value);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
