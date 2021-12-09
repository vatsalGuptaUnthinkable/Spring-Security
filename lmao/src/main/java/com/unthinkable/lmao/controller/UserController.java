package com.unthinkable.lmao.controller;

import com.unthinkable.lmao.entity.User;
import com.unthinkable.lmao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUser")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable("name") String userName){
        return userService.getByUserName(userName);
    }

}
