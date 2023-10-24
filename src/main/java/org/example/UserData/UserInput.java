package org.example.UserData;
//Reading User Input until 'Exit'
//Create a program where users can keep entering strings into the console.
// The program should terminate when the user types 'Exit'.
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings (type 'Exit' to terminate):");

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Exit")) {
                System.out.println("Program terminated.");
                break;
            } else {
                System.out.println("You entered: " + userInput);
            }
        }


    }
}
