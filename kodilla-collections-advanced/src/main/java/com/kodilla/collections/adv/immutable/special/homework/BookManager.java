package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    List<Book> books = new ArrayList<>();

    public void addBook(){
        books.add(new Book("Harry Potter", "J.K.Rowling"));
        books.add(new Book("W pustyni i w puszczy","H.Sienkieiwcz"));
    }

    public Book createBook(String author, String title){
        Book bookTemp = new Book(author, title);
       // books.add(bookTemp);
        for(Book bookElement: books){
            if(bookTemp.equals(bookElement)){
                return bookElement;
            } else {
                books.add(bookTemp);
            }
        }
        return bookTemp;
    }
}
