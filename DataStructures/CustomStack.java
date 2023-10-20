package org.startsteps.week7.Streams_Exercises.DataStructures;
//Create a custom stack class named CustomStack that operates on long data types.
// This stack should be implemented using an array and should provide basic stack operations.

public class CustomStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

// Constructor:
// The constructor should accept an integer s, which indicates the maximum size of the stack.
// Initialize maxSize with the value of s.
// Initialize stackArray to a new long array with the size of maxSize.
// Initialize top to -1, indicating that the stack is initially empty.

    public CustomStack(int s) {
        this.maxSize = s;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

//Methods :
// push(long j): Accepts a long value j and pushes it onto the top of the stack.
// Ensure that the stack does not overflow.

    public void push(long j) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + j);
        }
        else
        {
            stackArray[++top] = j;
        }
    }

//pop(): Removes and returns the top element of the stack. Ensure that the stack is not empty before popping.

    public long pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        else
        {
            return stackArray[top--];
        }
    }

//peek(): Returns the top element of the stack without removing it.

    public long peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        else
        {
            return stackArray[top];
        }
    }

//isEmpty(): Returns true if the stack is empty, otherwise false.

    public boolean isEmpty() {
        return (top == -1);
    }

//isFull(): Returns true if the stack is full, otherwise false.

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
