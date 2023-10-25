package org.example.Filereadandwrite;

import java.io.*;
import java.util.*;

public class UniqueWord {
    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>();

        readExistingContent(uniqueWords);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word (type 'Export' to save and exit): ");
            String input = scanner.nextLine().trim();


            if (input.equalsIgnoreCase("Export")) {

                saveUniqueWordsToFile(uniqueWords);
                break;
            } else if (!uniqueWords.contains(input)) {
                uniqueWords.add(input);
            }
        }

        scanner.close();
    }


    private static void readExistingContent(Set<String> uniqueWords) {
        try {
            FileReader fileReader = new FileReader("output1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                uniqueWords.addAll(Arrays.asList(words));
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }

    // Save unique words to "output.txt"
    private static void saveUniqueWordsToFile(Set<String> uniqueWords) {
        try {
            FileWriter fileWriter = new FileWriter("output1.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String word : uniqueWords) {
                bufferedWriter.write(word + " ");
            }

            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("Unique words have been saved to 'output1.txt'.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}