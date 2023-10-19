package org.startsteps.week7.Streams_Exercises.DataStructures;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionsExercise {

    void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.addLast(i);
    }

    void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.addFirst(i);
    }

    void removeItemFromTopOfStack(Deque<Integer> stack) {
        stack.pop();
    }

    void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.poll();
    }

    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        CollectionsExercise collectionsExercise = new CollectionsExercise();

        collectionsExercise.addToEndOfLinkedList(numberList, 42);
        collectionsExercise.addToStartOfLinkedList(numberList, 10);


        System.out.println( "Print the Linked List : " + numberList);

        Deque<Integer> stack = new LinkedList<>();
        stack.push(5);
        stack.push(8);
        stack.push(3);

        collectionsExercise.removeItemFromTopOfStack(stack);
        System.out.println("Stack: " + stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);

        collectionsExercise.removeItemFromFrontOfQueue(queue);
        System.out.println("Queue: " + queue);
    }
}
