package com.stackroute.PizzaServiceApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT,reason = "Pizza details already exists")
public class PizzaDetailsAlreadyExistsException extends Throwable {
}
