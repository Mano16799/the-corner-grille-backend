package com.stackroute.OrdersManagementApplication.model;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    private String email;
    private String password;
}
