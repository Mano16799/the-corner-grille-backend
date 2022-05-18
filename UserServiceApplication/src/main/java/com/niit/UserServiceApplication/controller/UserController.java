package com.niit.UserServiceApplication.controller;

import com.niit.UserServiceApplication.Exception.UserAlreadyExistsException;
import com.niit.UserServiceApplication.Exception.UserDoesNotExistException;
import com.niit.UserServiceApplication.model.User;
import com.niit.UserServiceApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/user/v1")
@CrossOrigin
public class UserController {
    private UserService userService;

    @Autowired
    public  UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("register")
    public ResponseEntity registerUser(@RequestBody User user) throws UserAlreadyExistsException {
        if(userService.findUserByUserEmail(user.getEmail())!=null){
            throw new UserAlreadyExistsException();
        }
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("users")
    public  ResponseEntity getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }

    @PostMapping("verify-user")
    public  ResponseEntity verifyUser(@RequestBody User user) throws UserDoesNotExistException {
        User foundUser = userService.findUserByUserEmail(user.getEmail());
        if(foundUser==null){
            throw new UserDoesNotExistException();
        }
        else if(!foundUser.getPassword().equals(user.getPassword())){
            return new ResponseEntity("Incorrect password",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(foundUser,HttpStatus.OK);
    }

}

