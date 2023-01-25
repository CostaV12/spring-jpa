package com.springbootjpa.springbootjpa.services;

import com.springbootjpa.springbootjpa.entities.User;
import com.springbootjpa.springbootjpa.repositories.UserRepository;
import com.springbootjpa.springbootjpa.services.exceptions.ResourceNotFoundException;
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
        return optionalUser.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    public User update (Integer id, User user) {
        User userEntity = userRepository.getReferenceById(id);
        updateDate(userEntity, user);
        return userRepository.save(userEntity);
    }

    private void updateDate(User userEntity, User user) {
        userEntity.setName(user.getName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPhone(user.getPhone());
    }
}
