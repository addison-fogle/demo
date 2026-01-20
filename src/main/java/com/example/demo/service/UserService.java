package com.example.demo.service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private User user;

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
