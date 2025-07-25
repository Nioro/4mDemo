package com.example.demo.repositories.impl;

import com.example.demo.entity.User;
import com.example.demo.repositories.InMemoryUserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryUserRepositoryImpl implements InMemoryUserRepository {
    private final List<User> users = new ArrayList<>();
    private long id = 1L;

    @Override
    public List<User> findAll() {
        // return List.of();
        return users;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return users.stream().filter(user ->
            user.getName().equalsIgnoreCase(username)
        ).findFirst();
    }

    @Override
    public Optional<User> findById(long id) {
        return users.stream().filter(user ->
                user.getId().equals(id)
        ).findFirst();
    }

    @Override
    public List<User> findByAge(int age) {
        return users.stream().filter(user ->
                user.getAge() >= age
        ).toList();
    }

    @Override
    public User save(User user) {
        if(user.getId() == null){
            user.setId(id++);
        }else{
            users.removeIf(user1 -> user1.getId().equals(user.getId()));
        }
        users.add(user);
        return user;
    }

    @Override
    public void deleteById(Long id) {
        users.removeIf(user1 -> user1.getId().equals(id));
    }
}
