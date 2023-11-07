package com.example.NOTEncrypt.services;

import com.example.NOTEncrypt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Chinmay Kulkarni","ckulkarni@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Tanmay Patil","tpatil@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Niranjan Bharate","nbharate@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
