package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        BookManager book = new BookManager();

        Book book1 = book.createBook("Harry Potter", "J.K.Rowling");
        Book book2 = book.createBook("W pustyni i w puszczy", "Henryk Sienkieiwcz");
        Book book3 = book.createBook("Pan Tadeusz", "Adam Mickieiwcz");
        Book book4 = book.createBook("Pan Tadeusz", "Adam Mickieiwcz");


        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());

        //System.out.println(book.getBooks());


    }
}
