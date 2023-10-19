package org.startsteps.week7.Streams_Exercises.DataStructures;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BookMain {
    public static void main(String[] args) {
        Queue<Book> books = new LinkedList<>();


        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 12.50));
        books.add(new Book("Moby-Dick", "Herman Melville", 1851, 14.75));
        books.add(new Book("War and Peace", "Leo Tolstoy", 1869, 13.99));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932, 10.25));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937, 12.99));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 17.50));
        books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, 15.75));
        books.add(new Book("1984", "George Orwell", 1949, 9.99));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813, 8.99));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 11.25));


        Book removedBook = books.poll();

        if (removedBook != null) {
            System.out.println("Removed Book:");
            System.out.println("Title: " + removedBook.getTitle());
            System.out.println("Author: " + removedBook.getAuthor());
            System.out.println("Publication Year: " + removedBook.getPublicationYear());
            System.out.println("Price: " + removedBook.getPrice());
        }
        else {

            System.out.println("No books to remove.");
        }

        Comparator<Book> bookComparator = Comparator.comparingInt(Book::getPublicationYear);

        PriorityQueue<Book> priorityBook = new PriorityQueue<>(bookComparator);


        System.out.println("List of Books (Ordered by Publication Year):");
        while (!books.isEmpty()) {
            Book book = books.poll();
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("Price: " + book.getPrice());
            System.out.println();
        }
    }
}











