package com.Corey.QuizMe.services;

import com.Corey.QuizMe.models.User;
import com.Corey.QuizMe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountRegisterService {

    private final UserRepository userRepository;

    @Autowired
    public AccountRegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
