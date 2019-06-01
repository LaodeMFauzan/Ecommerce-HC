package com.hc.demo.controller;

import com.hc.demo.model.UserModel;
import com.hc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String get() {
        return "hello world";
    }

    @RequestMapping("/all")
    public Hashtable<String, UserModel> getAll(){
        return userService.getAll();
    }

    @RequestMapping("{id}")
    public UserModel getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }
}
