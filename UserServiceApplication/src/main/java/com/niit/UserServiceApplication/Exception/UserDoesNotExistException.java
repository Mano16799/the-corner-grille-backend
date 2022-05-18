package com.niit.UserServiceApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT,reason = "Given user does not exist")
public class UserDoesNotExistException extends Throwable{
}
