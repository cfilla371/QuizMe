package com.Corey.QuizMe.controllers;

import com.Corey.QuizMe.models.User;
import com.Corey.QuizMe.services.AccountRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final AccountRegisterService accountRegisterService;

    @Autowired
    public UserController(AccountRegisterService accountRegisterService){
        this.accountRegisterService = accountRegisterService;
    }

    @PostMapping("/account/register")
    public User accountRegister(@RequestBody User user) {
        return accountRegisterService.createUser(user);
    };

//    @PostMapping("/account/update")
//    public User accountUpdate(@RequestBody User user) {
//
//    };

}
