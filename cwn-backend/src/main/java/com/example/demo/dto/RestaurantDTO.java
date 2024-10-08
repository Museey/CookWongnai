package com.example.demo.dto;
import java.util.List;

import com.example.demo.model.User;

public class RestaurantDTO {

    private Long id;
    private String name;
    private List<User> UsersWhoFavorited;

    public RestaurantDTO(Long id, String name, List<User> UsersWhoFavorited){
        this.id = id;
        this.name = name;
        this.UsersWhoFavorited = UsersWhoFavorited;
    }

    public RestaurantDTO(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsersWhoFavorited() {
        return UsersWhoFavorited;
    }

    public void setUsersWhoFavorited(List<User> usersWhoFavorited) {
        UsersWhoFavorited = usersWhoFavorited;
    }

    
    
}
