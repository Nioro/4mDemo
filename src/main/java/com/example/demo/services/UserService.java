package com.example.demo.services;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    List<User> getUserByAge(Integer Age);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByName(String name);
    User createUser(User user);
    User updateUser(User user, Long id);
    void deleteUser(Long id);
}
