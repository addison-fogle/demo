package com.example.demo.rest;

import com.example.demo.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/users")
    public List<User> getUsers() {

        return List.of();
    }

    @PostMapping("/users")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        log.info("postUsers with user {}", user);
        return ResponseEntity.ok(user);
    }
}
