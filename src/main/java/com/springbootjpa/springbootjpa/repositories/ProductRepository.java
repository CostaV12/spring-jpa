package com.springbootjpa.springbootjpa.repositories;

import com.springbootjpa.springbootjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
