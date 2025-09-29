package com.Corey.QuizMe.controllers;

import com.Corey.QuizMe.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/account/register")
    public User accountRegister(@RequestBody User user) {

    };

    @PostMapping("/account/update")
    public User accountUpdate(@RequestBody User user) {

    };

}
