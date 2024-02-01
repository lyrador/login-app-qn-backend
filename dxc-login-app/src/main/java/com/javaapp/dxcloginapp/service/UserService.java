package com.javaapp.dxcloginapp.service;

import com.javaapp.dxcloginapp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUsers();

    Optional<User> getUserByUsername(String username);

    User saveUser(User user);

    Optional<User> validUsernameAndPassword(String username, String password);
}
