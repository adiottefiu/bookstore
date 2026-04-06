package com.adiottefiu.bookstore.UserProfile_Classes;

public class CreditCard {
    //@Id denotes the primary key
    //The profile's username will be the primary key
    private String cardNumber;
    private String cardType;

   public CreditCard(String cardNumber, String cardType)
   {
    this.cardNumber = cardNumber;
    this.cardType = cardType;
   }

   public CreditCard()
   {
    //Empty constructor for springboot and mongodb to work
    //Please leave empty
   }

   //getter and setter methods
   public String getCardNumber()
   {
    return cardNumber;
   }
   public String setCardnumber(String newValue)
   {
    cardNumber = newValue;
    return cardNumber;
   }
    
   public String getCardType()
   {
    return cardType;
   }
   public String setCardType(String newValue)
   {
    cardType = newValue;
    return cardType;
   }
   
     
}