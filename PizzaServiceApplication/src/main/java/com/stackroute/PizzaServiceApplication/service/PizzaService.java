package com.stackroute.PizzaServiceApplication.service;

import com.stackroute.PizzaServiceApplication.model.Pizza;

import java.util.List;
import java.util.Optional;

public interface PizzaService {
    List<Pizza> getAllPizzaDetails();
    Pizza savePizzaDetails(Pizza pizza);
    Optional<Pizza> findPizzaById(int pizzaId);
}
