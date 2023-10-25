package org.example.UserData;
import java.io.*;
import java.util.Scanner;

public class DeleteInfo {
    public static void main(String[] args) {
        String filePath = "user_info.txt";

        try {

            BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
            StringBuilder userData = new StringBuilder();
            String line;
            while ((line = fileReader.readLine()) != null) {
                userData.append(line).append("\n");
            }
            fileReader.close();


            System.out.println("Current User Information:");
            System.out.println(userData.toString());


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your new email address (or press Enter to keep it unchanged): ");
            String newEmail = scanner.nextLine();
            System.out.print("Enter your new phone number (or press Enter to keep it unchanged): ");
            String newPhoneNumber = scanner.nextLine();
            System.out.print("Enter your new address (or press Enter to keep it unchanged): ");
            String newAddress = scanner.nextLine();


            System.out.print("Do you want to delete your information? (yes or no): ");
            String deleteChoice = scanner.nextLine();



            if ("yes".equalsIgnoreCase(deleteChoice)) {
                userData = new StringBuilder("");
            } else {
                if (!newEmail.isEmpty()) {
                    userData = new StringBuilder(userData.toString().replaceAll("Email: .*\n", "Email: " + newEmail + "\n"));
                }
                if (!newPhoneNumber.isEmpty()) {
                    userData = new StringBuilder(userData.toString().replaceAll("Phone Number: .*\n", "Phone Number: " + newPhoneNumber + "\n"));
                }
                if (!newAddress.isEmpty()) {
                    userData = new StringBuilder(userData.toString().replaceAll("Address: .*\n", "Address: " + newAddress + "\n"));
                }
            }


            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath));
            fileWriter.write(userData.toString());
            fileWriter.close();


            System.out.println("Updated or Deleted User Information:");
            System.out.println(userData.toString());
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
