package com.stackroute.OrdersManagementApplication.service;

import com.stackroute.OrdersManagementApplication.model.Order;
import com.stackroute.OrdersManagementApplication.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrdersByEmail(String email) {
        return orderRepository.findOrdersByEmail(email);
    }
}
