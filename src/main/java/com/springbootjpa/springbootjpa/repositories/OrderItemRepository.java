package com.springbootjpa.springbootjpa.repositories;

import com.springbootjpa.springbootjpa.entities.OrderItem;
import com.springbootjpa.springbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
