package com.adiottefiu.bookstore.Book_Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")

//Use functions from MongoRepository to perform database operations

public class BookController {
    @Autowired
    private final BookRepository bookRepo;


    public BookController(BookRepository bookRepo)
    {
        this.bookRepo = bookRepo;
    }
}
