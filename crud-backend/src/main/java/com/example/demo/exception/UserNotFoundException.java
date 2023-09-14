package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("could not find user with " + id);
    }
}
