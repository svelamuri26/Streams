package org.startsteps.week7.Streams_Exercises.DataStructures;

//Create a Queue class: This class will simulate the behavior of a queue data structure.
public class CustomQueue {
//Initialize Variables:
//queueLength: Set the default size of the queue to 3.
//items: An integer array that will store the elements of the queue.
//front and back: Pointers to help manage the queue's front and back,
// whose default value is -1. (indexes of front and back elements)
    int queueLength = 3;
    int items[] = new int[queueLength];
    int front = -1;
    int back = -1;



//isEmpty(): Checks if the queue is empty. Returns true if it is, otherwise returns false.

    public boolean isEmpty() {
        if (front == -1 && back == -1) {
            return true;
        } else {
            return false;
        }
    }
//isFulL(): Checks if the queue is full. Returns true if it is, otherwise returns false.

    public boolean isFull() {
        if (back == queueLength - 1) {
            return true;
        } else {
            return false;
        }

    }
//enQueue(int itemValue): Adds an item to the back of the queue.
//If the queue is full, it should display a message "Queue is full".

    public void enQueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            front = back = 0;
            items[front] = item;
        } else {
            back++;
            items[back] = item;
        }
    }

//deQueue(): Removes the front item from the queue. If the queue is empty,
// it should display imessage "Queue is empty. Nothing to dequeue".

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

//display(): Displays all the items present in the queue from front to back.

    public void display() {
        int i;

        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (i = front; i <= back; i++) {
                System.out.println(items[i]);
            }
        }
    }

// peak(): Displays the front item of the queue without removing it.

    public void peak() {
        System.out.println("Front value is: " + items[front]);

    }


    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();


        customQueue.enQueue(5);
        customQueue.enQueue(1);
        customQueue.enQueue(9);

        customQueue.deQueue();

        customQueue.display();

        customQueue.peak();

    }
}





