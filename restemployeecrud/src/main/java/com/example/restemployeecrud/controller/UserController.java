package com.example.restemployeecrud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restemployeecrud.exceptions.InvalidRequestException;
import com.example.restemployeecrud.exceptions.UserNotFoundException;
import com.example.restemployeecrud.model.User;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
       // User user = userRepository.findById(id);
    //	User user = new User("1001","Praveen","gs@kumar.com");
    	User user=null;
        if (user == null) {
            throw new UserNotFoundException("User not found with id: " + id);
        }
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        if (user == null || user.getName() == null || user.getEmail() == null) {
            throw new InvalidRequestException("Invalid user details provided.");
        }
        //userRepository.save(user);
        return ResponseEntity.ok("User created successfully");
    }
}

