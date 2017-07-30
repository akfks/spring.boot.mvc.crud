package com.cihangir.service;

import com.cihangir.model.Book;

import java.util.List;

/**
 * Created by cihangir on 7/30/17.
 */
public interface BookService {

    public void save(Book book);

    public List<Book> findAll();

    public Book findOne(Long theId);

    public void deleteBook(Long theId);

    public void updateBook(Book book);
}
