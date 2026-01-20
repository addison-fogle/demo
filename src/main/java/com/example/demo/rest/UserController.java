package com.example.demo.rest;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@Getter
@Setter
@NoArgsConstructor
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        log.info("postUsers with user {}", user);
        userService.saveUser(user);
        return ResponseEntity.ok(user);
    }
}
