package com.example._users_api.controllers;

import com.example._users_api.models.User;
import com.example._users_api.repositories.UsersRepository;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping(path= "/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;


    @GetMapping
    public Iterable<User> getAllUsers() {
        return usersRepository.findAll();
    }


    @PostMapping
    public Long postUser(@RequestBody User user) {
        usersRepository.save(user);
        return user.getId();
    }
}
