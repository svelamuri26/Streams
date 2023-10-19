package org.startsteps.week7.Streams_Exercises.DataStructures;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a queue with an initial element

        queue.enqueue(10); // Add elements to the back of the queue
        queue.enqueue(15);

        System.out.println("Queue Length: " + queue.getLength());

        System.out.println("Dequeue: " + queue.dequeue()); // Remove and retrieve the front element
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Queue Length: " + queue.getLength());

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }
}
