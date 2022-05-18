package com.niit.UserServiceApplication.service;

import com.niit.UserServiceApplication.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User findUserByUserEmail(String email);
}
