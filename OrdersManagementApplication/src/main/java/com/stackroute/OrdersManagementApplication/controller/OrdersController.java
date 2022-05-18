package com.stackroute.OrdersManagementApplication.controller;

import com.stackroute.OrdersManagementApplication.model.Order;
import com.stackroute.OrdersManagementApplication.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/orders/v1")
public class OrdersController {

    
    private OrderService orderService;
    @Autowired
    public OrdersController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("order")
    public ResponseEntity saveOrderDetails(@RequestBody Order order){
        return new ResponseEntity(orderService.saveOrder(order), HttpStatus.CREATED);
    }

    @PutMapping("order")
    public ResponseEntity modifyOrderDetails(@RequestBody Order order){
        return new ResponseEntity<>(orderService.saveOrder(order), HttpStatus.CREATED);
    }

    @GetMapping("orders/{email}")
    public ResponseEntity getAllOrdersByEmail(@PathVariable String email){
        return new ResponseEntity(orderService.getOrdersByEmail(email), HttpStatus.OK);
    }
}
