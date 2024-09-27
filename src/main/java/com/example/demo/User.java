package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Post> post;

    public User(){
        post = new ArrayList<>();
    }

    public User(String username, List<Post> post){
       this.username = username;
       this.post = post;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<com.example.demo.Post> getPost() {
        return post;
    }

    public void setPost(List<com.example.demo.Post> post) {
        post = post;
    }
}
