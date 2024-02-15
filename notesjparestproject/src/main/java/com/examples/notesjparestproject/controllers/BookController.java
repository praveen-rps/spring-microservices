package com.examples.notesjparestproject.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examples.notesjparestproject.models.Book;

import jakarta.validation.Valid;

@RestController
@Validated
public class BookController {

    @PostMapping("/books")
    public ResponseEntity<String> createBook(@Valid @RequestBody Book book) {
        // Logic to save the book
        return ResponseEntity.ok("Book created successfully");
    }
}
