package com.example._users_api.controllers;

import com.example._users_api.models.User;
import com.example._users_api.repositories.UsersRepository;

import com.example._users_api.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@RestController
@RequestMapping(path = "/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersService service;

    // Get : localhost:8080/users/5
    @GetMapping
    public Iterable<User> getAllUsers() {
        return service.getAllUser();
    }

    // GEt: localhost:8080/users/5
    @GetMapping
    public Optional<User> getUserById(Long id) {
        return service.getUserById(id);
    }

    // POST : localhost:8080/users
    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    // DELETE : localhost:8080/users/5
    @DeleteMapping("{id}")
    public boolean deleteUser(@PathVariable Long id) {
        return service.deleteUserById(id);

    }

    @PutMapping("/{id}")
    public boolean putUser(@PathVariable Long id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    @PostMapping("/seed")
    public boolean postSeedUsers() {
        return service.seed();


    }
}
