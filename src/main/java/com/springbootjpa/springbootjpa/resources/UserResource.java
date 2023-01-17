package com.springbootjpa.springbootjpa.resources;

import com.springbootjpa.springbootjpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1, "Vini", "vini@gmail.com", "(11) 95338-0525", "123456");
        return ResponseEntity.ok().body(user);
    }
}
