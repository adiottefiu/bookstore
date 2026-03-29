package com.adiottefiu.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adiottefiu.bookstore.Book_Classes.BookRepository;
import com.adiottefiu.bookstore.UserProfile_Classes.UserProfileRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(BookstoreApplication.class, args);
	}

		@Bean
		CommandLineRunner run(BookRepository bookRepo, UserProfileRepository profileRepo)
		{
			return args -> {
				System.out.println("This is a test.");
				System.out.println("Testing user profile.");
				//UserProfileController 
			};
		}
		//Repo controllers


	}

