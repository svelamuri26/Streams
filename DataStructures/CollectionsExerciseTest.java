package org.startsteps.week7.Streams_Exercises.DataStructures;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class CollectionsExerciseTest {

    @Test
    public void testAddToEndOfLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>();
        CollectionsExercise exercise = new CollectionsExercise();

        exercise.addToEndOfLinkedList(numbers, 42);
        assertEquals(Integer.valueOf(42), numbers.getLast());
    }

    @Test
    public void testAddToStartOfLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>();
        CollectionsExercise exercise = new CollectionsExercise();

        exercise.addToStartOfLinkedList(numbers, 10);
        assertEquals(Integer.valueOf(10), numbers.getFirst());
    }

    @Test
    public void testRemoveItemFromTopOfStack() {
        Deque<Integer> stack = new LinkedList<>();
        CollectionsExercise exercise = new CollectionsExercise();

        stack.push(5);
        stack.push(8);
        stack.push(3);

        exercise.removeItemFromTopOfStack(stack);
        assertEquals(8, stack.getFirst().intValue());
    }

    @Test
    public void testRemoveItemFromFrontOfQueue() {
        Queue<Integer> queue = new LinkedList<>();
        CollectionsExercise exercise = new CollectionsExercise();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);

        exercise.removeItemFromFrontOfQueue(queue);
        assertEquals(200, queue.poll().intValue());
    }
}
