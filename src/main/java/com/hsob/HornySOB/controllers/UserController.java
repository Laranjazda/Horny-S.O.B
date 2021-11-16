package com.hsob.HornySOB.controllers;

import com.hsob.HornySOB.model.User;
import com.hsob.HornySOB.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserSevice userSevice;

    @PostMapping
    public Object saveUser(@RequestBody User user){

        return userSevice.addUser(user);
    }

    @GetMapping("/findAll")
    public List<User> getAllUsers(){
        return userSevice.getAll();
    }

}
