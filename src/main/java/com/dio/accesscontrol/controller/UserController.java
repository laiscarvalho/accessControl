package com.dio.accesscontrol.controller;

import com.dio.accesscontrol.model.User;
import com.dio.accesscontrol.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return  userService.saveUser(user);
    }
    @GetMapping
    public List<User> getUser(){
        return  userService.findAll();
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") long userId )throws Exception {
        return ResponseEntity.ok(userService.findById(userId)
                .orElseThrow(()-> new Exception("user not found")));
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping
    public HttpStatus deleteUser(long userId){
        userService.deleteUser(userId);
        return HttpStatus.OK;
    }

}
