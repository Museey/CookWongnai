package com.example.demo.service;

public class ReviewNotFoundException extends RuntimeException {
    public ReviewNotFoundException(Long id){
        super("Review not found with id:" + id);
    }   
}