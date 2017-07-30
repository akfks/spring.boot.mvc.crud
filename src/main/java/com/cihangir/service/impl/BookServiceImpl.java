package com.cihangir.service.impl;

import com.cihangir.dao.BookRepository;
import com.cihangir.model.Book;
import com.cihangir.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cihangir on 7/30/17.
 */

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();

        for(Book book : bookRepository.findAll()){
            bookList.add(book);
        }

        return bookList;
    }

    @Override
    public Book findOne(Long theId) {
        return bookRepository.findOne(theId);
    }

    @Override
    public void deleteBook(Long theId) {
        bookRepository.delete(theId);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
