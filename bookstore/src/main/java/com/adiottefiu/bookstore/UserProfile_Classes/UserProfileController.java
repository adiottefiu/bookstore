package com.adiottefiu.bookstore.UserProfile_Classes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")

public class UserProfileController {
    

    private final UserProfileRepository profileRepo;

    public UserProfileController(UserProfileRepository profileRepo)
    {
        this.profileRepo = profileRepo;
    }

    @GetMapping("/createUser/{username}/{password}/{name}/{email_address}/{home_address}")
    public void createUser(@PathVariable String username, @PathVariable String password, @PathVariable String name, @PathVariable String email_address, @PathVariable String home_address)
    {
        UserProfile newProfile = new UserProfile(username, password, name, email_address, home_address);
        profileRepo.save(newProfile);
    }
    @GetMapping("/getUser/{username}")
    public UserProfile getUser(@PathVariable String username)
    {
        UserProfile profileObject = profileRepo.findById(username).orElse(new UserProfile("User Not found", "N/A", "N/A", "N/A", "N/A"));
        return profileObject;
    }

    //Used to update a field that the user specifies
    //Valid values for "fieldname" include "username", "password", "name", "email", and "address" (for home address)
    @GetMapping("/updateUser/{username}/{fieldname}/{value}")
    public void updateUser(@PathVariable String username, @PathVariable String fieldname, @PathVariable String value)
    {
        UserProfile profileObject = getUser(username);
        if (profileObject.getUsername().equals("User Not found"))
        {
            return;
        }
        if (fieldname.equals("username"))
        {
            profileObject.setUsername(value);
        }
        else if (fieldname.equals("password"))
        {
            profileObject.setPassword(value);
        }
        else if (fieldname.equals("name"))
        {
            profileObject.setName(value);
        }
        else if (fieldname.equals("email"))
        {
            profileObject.setEmail(value);
        }
        else if (fieldname.equals("address"))
        {
            profileObject.setAddress(value);
        }
        else
        {
            return;
        }
        profileRepo.save(profileObject);

    }

    @GetMapping("/createCard/{username}/{cardNumber}/{cardType}")
    public void createCreditCard(@PathVariable String username, @PathVariable int cardNumber, @PathVariable String cardType)
    {
        UserProfile profileObject = getUser(username);
        //Check for first empty space in Credit Cards array
        int position = 0;

        for (position = 0; position < 50; position++)
        {
            if (profileObject.getCreditCard(position) == null)
            {
                break;
            }    
        }

        CreditCard newCard = new CreditCard(cardNumber, cardType);
        profileObject.setCreditCard(newCard, position);
        profileRepo.save(profileObject);
    }

}
