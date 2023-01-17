package com.springbootjpa.springbootjpa.repositories;

import com.springbootjpa.springbootjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
