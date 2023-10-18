package org.startsteps.week7.Streams_Exercises;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Exercise 1.
Objective: Imagine you have a list of integer numbers. Your task is to filter out all even numbers from this list and create a new list containing only the odd numbers.
Expected Outcome: Given a list like [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], your output should be [1, 3, 5, 7, 9].
Bonus: Return the sum of the filtered odd numbers.*/

public class OddNumberExercise {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);

        System.out.println("Printing the collection: " + al);
        List<Integer> oddNumbers = al.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Odd numbers are : " + oddNumbers);

        int Sum = al.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of Odd Numbers is : " + Sum);

    }
}
