package org.startsteps.week7.Streams_Exercises;
import java.util.ArrayList;
import java.util.OptionalDouble;

//Exercise 3.
//Objective: You have a list of integers. Calculate the sum of all these integers.
//Expected Outcome: Given a list like [1, 2, 3, 4, 5], the computed sum should be 15.
//Bonus: Find the average of the list.

public class SumOfIntegers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Numbers in the list : " + numbers);

        Integer sum = numbers.stream().mapToInt(Integer::intValue) .sum();

        System.out.println("Sum of Integers in array is : "+ sum);

        OptionalDouble avg = numbers.stream().mapToInt(Integer::intValue) .average();

        System.out.println("Average of the Integers is : " + avg );
    }
}
