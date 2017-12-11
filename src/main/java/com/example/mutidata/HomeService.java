package com.example.mutidata;

import com.example.mutidata.model.postgresql.Book;
import com.example.mutidata.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBook(){
        List<Book> book = new ArrayList<>();
        bookRepository.findAll().forEach(book::add);
        return book;
    }

    public Book getBook(String id)
    {
        return bookRepository.findOne(id);
    }

    public void addBook(Book book)
    {
        bookRepository.save(book);
    }

    public void updateBook(String id, Book book)
    {
        bookRepository.save(book);
    }

    public void deleteBook(String id)
    {
        bookRepository.delete(id);
    }
}
