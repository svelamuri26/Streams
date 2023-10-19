package org.startsteps.week7.Streams_Exercises.DataStructures;


public class Queue {
    private Node first;  // Reference to the first node in the queue
    private Node last;   // Reference to the last node in the queue
    private int length;  // Current length of the queue

    // Nested Node class
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Constructor for the Queue class
    public Queue(int value) {
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length = 1;
    }

    // Enqueue method to add an element to the back of the queue

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    // Dequeue method to remove and return the element at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int value = this.first.value;
        this.first = this.first.next;
        this.length--;

        if (isEmpty()) {
            this.last = null;  // If the queue becomes empty after dequeue
        }

        return value;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return this.length == 0;
    }

    // Get the current length of the queue
    public int getLength() {
        return this.length;
    }

}


