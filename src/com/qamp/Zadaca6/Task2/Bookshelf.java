package com.qamp.Zadaca6.Task2;
import java.util.LinkedList;
import java.util.List;

public class Bookshelf {

    final List <Book> listOfBooks = new LinkedList<> (){};

    public Bookshelf() {}

    public void addBook (Book book)
    {
        listOfBooks.add(book);
    }

    public boolean containsBook(String title) {
        for (Book book : listOfBooks) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(long ISBN){
        for(Book book  : listOfBooks){
            if(book.getISBN() == ISBN){
                return true;
            }
        } return false;
    }

    public void printBookshelf(){
        for(Book booksInInventory : listOfBooks ){
            System.out.println(booksInInventory.toString());
        }
    }

}
