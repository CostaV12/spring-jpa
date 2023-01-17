package com.springbootjpa.springbootjpa.repositories;

import com.springbootjpa.springbootjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
