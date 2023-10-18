package org.startsteps.week7.Streams_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Exercise 2.
//Objective: You are given a list of words in lowercase. Your challenge is to transform each word into its uppercase counterpart.
//Expected Outcome: Given a list like ["hello", "world", "streams", "java"], the transformed list should be ["HELLO", "WORLD", "STREAMS", "JAVA"].
//Bonus: Count the number of characters in the transformed list (excluding spaces).
public class UpperCaseStream {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Hello");
        al.add("World");
        al.add("Stream");
        al.add("Java");

        System.out.println("List is : " + al);

        List<String> upperCase = al.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase List : " + upperCase );

        int totalCharacters = al.stream()
                .map(String::length)
                .reduce(0, Integer::sum);


        System.out.println("Total characters in all names: " + totalCharacters);

    }
}
