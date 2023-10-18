package org.startsteps.week7.Streams_Exercises;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

//Objective: Join all strings from a given list into a single string.
// These words should be separated by commas in the resulting string.
//Expected Outcome: From a list such as ["apple", "banana", "cherry"],
// the resulting string should be "apple,banana,cherry".
//Bonus: Reverse the order of the words in the resulting string.
// So, for the list ["apple", "banana", "cherry"], the resulting string would be "cherry,banana,apple".

import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");

        System.out.println(fruitList);


        String fruitString = fruitList.stream()
                .collect(Collectors.joining(","));

        System.out.println(fruitString);


    }

}
