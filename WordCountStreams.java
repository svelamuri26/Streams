package org.startsteps.week7.Streams_Exercises;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Exercise 5.
//Objective: Given a list of words, count how many words have more than 3 characters.
//Expected Outcome: For a list like ["cat", "elephant", "dog", "dolphin"], the count should be 2 since "elephant" and "dolphin" have more than 3 characters.
//Bonus: Return the shortest word from the list.

public class WordCountStreams {

    public static int countMoreThan3Characters(List<String> wordList) {
        return (int) wordList.stream()
                .filter(word -> word.length() > 3)
                .count();
    }

    public static Optional<String> findShortestWord(List<String> wordList) {
        return wordList.stream()
                .min((word1, word2) -> Integer.compare(word1.length(), word2.length()));
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("cat", "elephant", "dog", "dolphin");

        int count = countMoreThan3Characters(wordList);
        Optional<String> shortestWord = findShortestWord(wordList);

        System.out.println("Number of words with more than 3 characters: " + count);
        System.out.println("Shortest word: " +  shortestWord.get() );
    }



}
