package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        //Book book1 = bookManager.createBook("Harry Potter", "J.K.Rowling");
        //Book book2 = bookManager.createBook("W pustyni i w puszczy", "H.Sienkiewicz");
        //Book book3 = bookManager.createBook("Pan Tadeusz", "A.Mickiewcz");
        //Book book4 = bookManager.createBook("Pan Tadeusz", "A.Mickiewcz");

        //System.out.println(book1.hashCode());
        //System.out.println(book2.hashCode());
        //System.out.println(book3.hashCode());
        //System.out.println(book4.hashCode());


        bookManager.addBook();
        System.out.println(bookManager.books.size());
        bookManager.createBook("Pan Tadeusz", "A.Mickiewicz");
        System.out.println(bookManager.books.size());
    }
}
