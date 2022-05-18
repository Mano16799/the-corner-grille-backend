package com.stackroute.OrdersManagementApplication.repository;

import com.stackroute.OrdersManagementApplication.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {
    @Query("{'userDetails.email' : {$in : [?0]}}")
    List<Order> findOrdersByEmail(String email);
}
