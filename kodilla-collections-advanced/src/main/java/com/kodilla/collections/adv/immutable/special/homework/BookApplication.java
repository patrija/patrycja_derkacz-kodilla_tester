package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Harry Potter", "J.K.Rowling");
        Book book2 = bookManager.createBook("W pustyni i w puszczy", "Henryk Sienkieiwcz");
        Book book3 = bookManager.createBook("Pan Tadeusz", "Adam Mickieiwcz");
        Book book4 = bookManager.createBook("Pan Tadeusz", "Adam Mickieiwcz");


        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());

        System.out.println(bookManager.getBooks());


    }
}
