package com.springbootjpa.springbootjpa.services;

import com.springbootjpa.springbootjpa.entities.Order;
import com.springbootjpa.springbootjpa.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Integer id) {
        Optional<Order> optionalUser = orderRepository.findById(id);
        return optionalUser.get();
    }
}
