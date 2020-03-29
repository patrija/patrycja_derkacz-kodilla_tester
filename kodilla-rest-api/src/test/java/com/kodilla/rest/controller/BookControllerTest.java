package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("author 1","title 1"));
        bookList.add(new BookDto("author 2", "title 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        Assertions.assertEquals(2, bookList.size());
    }

    @Test
    public void shouldAddBook() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        BookDto book1 = new BookDto("author 1","title 1");
        bookList.add(book1);

        BookDto book2 = new BookDto("author 2","title 2");
        bookList.add(book2) ;

        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);

        //when
        bookController.addBook(book1);
        bookController.addBook(book2);
        List<BookDto> result = bookController.getBooks();

        //then
        Assertions.assertEquals(2, result.size());
    }

}

