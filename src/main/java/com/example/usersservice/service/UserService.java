package com.example.usersservice.service;


import com.example.usersservice.model.User;
import com.example.usersservice.model.UserResource;

public interface UserService {

  UserResource registerNewUser(User user);

  Object findById(Long id);
}
