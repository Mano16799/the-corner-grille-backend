package com.stackroute.PizzaServiceApplication.service;

import com.stackroute.PizzaServiceApplication.model.Pizza;
import com.stackroute.PizzaServiceApplication.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaServiceImpl implements PizzaService{
    private PizzaRepository pizzaRepository;
    @Autowired
    public PizzaServiceImpl(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public List<Pizza> getAllPizzaDetails() {
        return pizzaRepository.findAll();
    }

    @Override
    public Pizza savePizzaDetails(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @Override
    public Optional<Pizza> findPizzaById(int pizzaId) {
        return pizzaRepository.findById(pizzaId);
    }
}


class S{
    public <D> D getValue(D t){
        return t;
    }
}