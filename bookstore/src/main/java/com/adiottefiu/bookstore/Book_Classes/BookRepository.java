package com.adiottefiu.bookstore.Book_Classes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer>
{

}
