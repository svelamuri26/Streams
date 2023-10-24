package org.example.IOStreamsExceptions;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryFile {
    public static void main(String[] args) {
        String sourceFilePath = "image1.jpeg";
        String destinationFilePath = "copy_image1.jpeg";

        try (FileInputStream sourceInputStream = new FileInputStream("/Users/saivelamuri/Desktop/image1.jpeg");
             FileOutputStream destinationOutputStream = new FileOutputStream(destinationFilePath)) {

            int bytesRead;
            byte[] buffer = new byte[1024];

            while ((bytesRead = sourceInputStream.read(buffer)) != -1) {
                destinationOutputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
