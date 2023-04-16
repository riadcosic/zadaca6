package com.qamp.Zadaca6.Task2;

public class Book {

    final private String title;
    final private long ISBN;
    final private String author;

    public Book(String title, long ISBN, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public long getISBN() {
        return this.ISBN;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString(){
        return this.title + ", " + this.author + " (" + this.ISBN + ")";
    }

}


