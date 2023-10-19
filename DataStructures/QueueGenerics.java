package org.startsteps.week7.Streams_Exercises.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class QueueGenerics<T> {
     int queueLength;
     List<T> items;
     int front;
     int back;

    public QueueGenerics(int maxQueueSize) {
        queueLength = 3;
        items = new ArrayList<>(queueLength);
        front = -1;
        back = -1;
    }


    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return back == queueLength - 1;
    }

    public void enQueue(T itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            back++;
            items.add(back, itemValue);
        }
    }

    public T deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
            return null;
        } else {
            T item = items.get(front);
            if (front == back) {
                front = back = -1;
            } else {
                front++;
            }
            return item;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= back; i++) {
                System.out.print(items.get(i) + " ");
            }
            System.out.println();
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return items.get(front);
        }
    }

    public static void main(String[] args) {
        QueueGenerics<Integer> intQueue = new QueueGenerics<>(3);
        intQueue.enQueue(1);
        intQueue.enQueue(2);
        intQueue.enQueue(3);
        intQueue.enQueue(3);
        intQueue.enQueue(3);

        System.out.println("Front item: " + intQueue.peek());

        intQueue.display();

        intQueue.deQueue();

        intQueue.display();
    }
}

