package com.example._users_api.services;


import com.example._users_api.models.User;
import com.example._users_api.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    UsersRepository repository;


    //Get all users
    public Iterable<User> getAllUser() {
        return repository.findAll();
    }

    //Get one user
    public Optional<User> getUserById(Long id) {
        return repository.findById(id);
    }

    //Create user
    public User createUser(User user) {
        return repository.save(user);
    }


    public boolean updateUser(Long id, User user) {
        if (repository.existsById(id)) {
            user.setId(id);

            repository.save(user);
            return true;
        }
        return false;

    }

    public boolean deleteUserById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean seed() {
        try {
            User[] users = {
                    new User("Geetika", "geetika@gmail.com"),
                    new User("Nitin", "nitin@gmail.com"),
                    new User("Jens Sen", "jens@ssen.se")

            };

            var usersList = Arrays.stream(users).toList();

            repository.saveAll(usersList);

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}
