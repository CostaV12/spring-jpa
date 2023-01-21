package com.springbootjpa.springbootjpa.services;

import com.springbootjpa.springbootjpa.entities.User;
import com.springbootjpa.springbootjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
