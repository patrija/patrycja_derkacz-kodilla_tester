package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
    Book book = new BookHacked ("Maks", "Przeminelo z Maksem");
    BookHacked bookHacked = (BookHacked) book;
        System.out.println(book.getTitle());

    }
}
