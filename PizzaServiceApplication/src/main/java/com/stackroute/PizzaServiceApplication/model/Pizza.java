package com.stackroute.PizzaServiceApplication.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pizza {
    @Id
    private int id;
    private String name, description, url, type;
    private double cost;
    private List<Size> availableSizes;
    private List<Toppings> availableToppings;
    private List<Crust> availableCrusts;
}
