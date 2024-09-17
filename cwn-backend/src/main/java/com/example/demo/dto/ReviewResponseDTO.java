package com.example.demo.dto;

public class ReviewResponseDTO {
    private Long id;
    private int rating;
    private String comment;
    private String username;
    
    public ReviewResponseDTO(){
        
    }

    
    public ReviewResponseDTO(Long id, int rating, String comment, String username) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.username = username;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    
}