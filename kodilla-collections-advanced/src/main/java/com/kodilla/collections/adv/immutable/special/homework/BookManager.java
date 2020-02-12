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
        Book temp = new Book(title, author);
        System.out.println(temp.getTitle());
        System.out.println(books.size());
       // if (books.size() == 0) {
      //      addBookToCollection(temp);
       //     System.out.println();
       // }

        for (Book book : books) {
            if (temp.equals(books)) {
            } else {
                addBookToCollection(temp);
            }
        }
        return temp;
    }

  public List<Book> getBooks() {
        return books;
  }
}








