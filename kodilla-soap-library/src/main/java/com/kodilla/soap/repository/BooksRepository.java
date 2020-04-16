package com.kodilla.soap.repository;

import com.kodilla.courses.soap.Book;
import com.kodilla.courses.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book scifi = new Book();
        scifi.setSignature("125");
        scifi.setTitle("Bajki robotow");
        scifi.setAuthor("Stanislaw Lem");
        scifi.setYearOfPublication(2012);
        scifi.setGenre(Genre.SCI_FI);

        books.put(scifi.getSignature(), scifi);

        Book fantasy = new Book();
        fantasy.setSignature("223");
        fantasy.setTitle("Hobbit");
        fantasy.setAuthor("J.R.R Tolkien");
        fantasy.setYearOfPublication(2014);
        fantasy.setGenre(Genre.FANTASY);

        books.put(fantasy.getSignature(), fantasy);

        Book tech = new Book();
        tech.setSignature("38");
        tech.setTitle("Java. Podstawy");
        tech.setAuthor("Horstmann Cay S.");
        tech.setYearOfPublication(2019);
        tech.setGenre(Genre.TECH);

        books.put(tech.getSignature(), tech);

        Book crime = new Book();
        crime.setSignature("399");
        crime.setTitle("Latarnik");
        crime.setAuthor("Camila Lackberg");
        crime.setYearOfPublication(2016);
        crime.setGenre(Genre.CRIME);

        books.put(crime.getSignature(), crime);
    }

    public Book findBook(String signature){
        Assert.notNull(signature, "You have to specify book signature");
        return books.get(signature);
    }
}

