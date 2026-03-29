package com.adiottefiu.bookstore.UserProfile_Classes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile, String>
{
    
}
