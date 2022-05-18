package com.stackroute.OrdersManagementApplication.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document
public class Order {
    private User userDetails;
    private List<Pizza> pizzaList;
    private double totalCost;
    private String orderDate;
}
