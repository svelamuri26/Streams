package org.startsteps.week7.Streams_Exercises.DataStructures;

public class MainStack {

        public static void main(String[] args) {
            int maxSize = 1;

            CustomStack customStack = new CustomStack(maxSize);


            customStack.push(10);
            customStack.push(20);
            customStack.push(30);
            customStack.push(40);
            customStack.push(50);
            customStack.push(60);


            long topElement = customStack.peek();
            System.out.println("Top element: " + topElement);


            long poppedElement = customStack.pop();
            System.out.println("Popped element: " + poppedElement);


            boolean isEmpty = customStack.isEmpty();
            boolean isFull = customStack.isFull();

            System.out.println("Is the stack empty? " + isEmpty);
            System.out.println("Is the stack full? " + isFull);
        }
}


