package com.springbootjpa.springbootjpa.repositories;

import com.springbootjpa.springbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
