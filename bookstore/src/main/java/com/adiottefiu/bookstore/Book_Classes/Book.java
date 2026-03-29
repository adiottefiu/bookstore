package com.adiottefiu.bookstore.Book_Classes;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;
import lombok.*;

//@Document annotation denotes which MongoDB "collection" that the Java class corresponds to
@Document(collection = "books")
public class Book {
  
    //@id annotation is used to denote primary key
    @Id
    private int isbn;

    private String title;
    private String description;
    private String author;
    private String publisher;
    private String genre;
    private int sales;
    private int rating;



}