package com.stackroute.PizzaServiceApplication.repository;

import com.stackroute.PizzaServiceApplication.model.Pizza;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PizzaRepository extends MongoRepository<Pizza, Integer> {
}
