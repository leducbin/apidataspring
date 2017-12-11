package com.example.mutidata.controller;


import com.example.mutidata.HomeService;
import com.example.mutidata.model.postgresql.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "/")
    public String show()
    {
        return "Hello";
    }

    @RequestMapping("/books")
    public List<Book> getAllBook()
    {
        System.out.print("Alooooooooooo");
        return homeService.getAllBook();
    }

    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable String id)
    {
        return homeService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book)
    {
        homeService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void addBook(@RequestBody Book book,@PathVariable String id)
    {
        homeService.updateBook(id,book);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/books/{id}")
    public void deleteBook(@PathVariable String id)
    {
        homeService.deleteBook(id);
    }
}
