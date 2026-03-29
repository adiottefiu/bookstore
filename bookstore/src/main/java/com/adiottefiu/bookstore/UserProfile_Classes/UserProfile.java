package com.adiottefiu.bookstore.UserProfile_Classes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document annotation denotes which MongoDB "collection" that the Java class corresponds to
@Document(collection = "profiles")

public class UserProfile {
    //@Id denotes the primary key
    //The profile's username will be the primary key
    @Id
    private String username;

    private String password;
    private String name;
    private String email_address;
    private String home_address;
    private CreditCard[] creditCards;

   public UserProfile(String username, String password, String name, String email_address, String home_address)
   {
    this.username = username;
    this.password = password;
    this.name = name;
    this.email_address = email_address;
    this.home_address = home_address;
    creditCards = new CreditCard[50];
   }

   public UserProfile()
   {
    //Empty constructor for springboot and mongodb to work
    //Please leave empty
   }

   //getter and setter methods
   public String getUsername()
   {
    return username;
   }
   public String setUsername(String newValue)
   {
    username = newValue;
    return username;
   }
    
   public String getPassword()
   {
    return password;
   }
   public String setPassword(String newValue)
   {
    password = newValue;
    return password;
   }

   public String getName()
   {
    return name;
   }
   public String setName(String newValue)
   {
    name = newValue;
    return name;
   }

   public String getEmail()
   {
    return email_address;
   }
   public String setEmail(String newValue)
   {
    email_address = newValue;
    return email_address;
   }

   public String getAddress()
   {
    return home_address;
   }
   public String setAddress(String newValue)
   {
    home_address = newValue;
    return home_address;
   }
   
   public CreditCard getCreditCard(int position)
   {
    return creditCards[position];
   }
   public CreditCard setCreditCard(CreditCard obj, int position)
   {
    creditCards[position] = obj;
    return obj;
   }

}