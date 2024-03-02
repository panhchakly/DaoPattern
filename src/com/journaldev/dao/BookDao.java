package com.journaldev.dao;

import com.journaldev.model.Books;

import java.util.List;

public interface BookDao {

    List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void addBook(Books book);
    void deleteBook(Books book);
}
