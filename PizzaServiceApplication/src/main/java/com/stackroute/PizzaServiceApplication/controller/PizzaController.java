package com.stackroute.PizzaServiceApplication.controller;

import com.stackroute.PizzaServiceApplication.Exception.PizzaDetailsAlreadyExistsException;
import com.stackroute.PizzaServiceApplication.model.Pizza;
import com.stackroute.PizzaServiceApplication.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/pizza/v1")
public class PizzaController {

    private PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService){
        this.pizzaService =pizzaService;
    }

    @GetMapping("pizzas")
    public ResponseEntity getAllPizzaDetails(){
        return new ResponseEntity<>(pizzaService.getAllPizzaDetails(), HttpStatus.OK);
    }

    @PostMapping("pizza")
    public ResponseEntity savePizzaDetails(@RequestBody Pizza pizza) throws PizzaDetailsAlreadyExistsException {
        if(pizzaService.findPizzaById(pizza.getId()).isPresent()){
            throw new PizzaDetailsAlreadyExistsException();
        }
        return new ResponseEntity(pizzaService.savePizzaDetails(pizza), HttpStatus.CREATED);
    }

}
