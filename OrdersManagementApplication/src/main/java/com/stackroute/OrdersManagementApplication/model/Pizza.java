package com.stackroute.OrdersManagementApplication.model;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pizza {
    private int quantity;
    private String pizzaName,size, crustChoice, toppingsChoice;
    private double cost;
}
