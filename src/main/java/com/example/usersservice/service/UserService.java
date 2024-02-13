package com.example.usersservice.service;


import com.example.usersservice.model.User;
import com.example.usersservice.model.UserResource;

public interface UserService {

  UserResource registerNewUser(User user);

  UserResource updateUser(User user, Long id);

  Object findById(Long id);
}
