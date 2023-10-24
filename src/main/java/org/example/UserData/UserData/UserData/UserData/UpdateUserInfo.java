package org.example.UserData.UserData.UserData.UserData;
import java.io.*;
import java.util.Scanner;

public class UpdateUserInfo {
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
            System.out.print("Enter your new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            System.out.print("Enter your new Email address: ");
            String newemailAddress = scanner.nextLine();
            scanner.close();



            userData = new StringBuilder(userData.toString().replaceAll("Phone Number: .*\n", "Phone Number: " + newPhoneNumber + "\n"));
            userData = new StringBuilder(userData.toString().replaceAll("Email Address: .*\n", "Email Address: " + newemailAddress + "\n"));


            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath));
            fileWriter.write(userData.toString());
            fileWriter.close();


            System.out.println("Updated User Information:");
            System.out.println(userData.toString());
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
