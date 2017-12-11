package com.example.mutidata.repository;

import com.example.mutidata.model.postgresql.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
}
