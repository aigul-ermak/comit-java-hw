package org.comit.course._06_practice;

public class Book {
	private String title;
    private String author;
    private String isbn;

    // Parameterized Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}
