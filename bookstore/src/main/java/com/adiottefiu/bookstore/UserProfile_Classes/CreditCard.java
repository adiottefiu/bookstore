package com.adiottefiu.bookstore.UserProfile_Classes;

public class CreditCard {
    //@Id denotes the primary key
    //The profile's username will be the primary key
    private Integer cardNumber;
    private String cardType;

   public CreditCard(int cardNumber, String cardType)
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
   public int getCardNumber()
   {
    return cardNumber;
   }
   public int setCardnumber(int newValue)
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