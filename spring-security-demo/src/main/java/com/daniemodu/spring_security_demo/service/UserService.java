package com.daniemodu.spring_security_demo.service;

import com.daniemodu.spring_security_demo.model.User;
import com.daniemodu.spring_security_demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
