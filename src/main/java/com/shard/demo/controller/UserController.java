package com.shard.demo.controller;

import com.shard.demo.entity.User;
import com.shard.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public List<User> select(){
        return userService.list();
    }

    @GetMapping("/insert")
    public Boolean insert(User user){
        return userService.save(user);
    }
}