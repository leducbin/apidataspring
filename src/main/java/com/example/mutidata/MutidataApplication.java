package com.example.mutidata;

import com.example.mutidata.controller.HomeController;
import com.example.mutidata.model.postgresql.Book;
import com.example.mutidata.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.mutidata.config"})
public class MutidataApplication {
	public static void main(String[] args) {
		SpringApplication.run(MutidataApplication.class, args);
	}
}
