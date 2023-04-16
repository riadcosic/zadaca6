package com.qamp.Zadaca6.Task2;

public class Main {

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();

        Book book1 = new Book("Angels and demons", 9780606304955L, "Dan Brown");
        Book book2 = new Book("Inferno", 9780606304958L, "Dan Brown");

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);


        boolean hasBook1 = bookshelf.containsBook("Angels and demons");
        System.out.println("Status of the book, searched by the title:" + hasBook1);

        boolean hasBook2 = bookshelf.containsBook(9780606304958L);
        System.out.println("Status of the book, searched by the ISBN:" + hasBook2);



        System.out.println("Books on the shelf:");
        bookshelf.printBookshelf();
    }

}
