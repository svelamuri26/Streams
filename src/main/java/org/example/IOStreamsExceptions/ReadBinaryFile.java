package org.example.IOStreamsExceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String[] args) {
        String filePath = "image1.jpeg";

        try (FileInputStream fileInputStream = new FileInputStream("/Users/saivelamuri/Desktop/image1.jpeg")) {
            int bytesRead;
            byte[] buffer = new byte[1024];

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {

                for (int i = 0; i < bytesRead; i++) {
                    System.out.printf("%02X ", buffer[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
