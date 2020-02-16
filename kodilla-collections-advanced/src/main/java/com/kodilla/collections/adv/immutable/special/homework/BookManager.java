package com.kodilla.collections.adv.immutable.special.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;


public class BookManager {
    List<Book> books = new ArrayList<>();

    public void addBookToCollection(Book book) {
        books.add(book);
    }

    public Book createBook(String title, String author) {
        Book tempBook = new Book(title, author);
        System.out.println("Dodaje ksiazke");
        System.out.println(tempBook);
        if (books.size() == 0) {
            addBookToCollection(tempBook);
        }
       //     System.out.println();
       // }

        for (Book bookElement : books) {
            if (tempBook.equals(bookElement)) {
            } else {
                addBookToCollection(tempBook);
            }

        }
        return tempBook;
    }

    public List<Book> getBooks() {
        return books;
    }
}








