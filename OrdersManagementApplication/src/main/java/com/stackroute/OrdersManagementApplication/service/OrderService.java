package com.stackroute.OrdersManagementApplication.service;

import com.stackroute.OrdersManagementApplication.model.Order;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order> getOrdersByEmail(String email);
}
