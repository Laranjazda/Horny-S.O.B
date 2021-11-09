package com.hsob.HornySOB.controllers;

import com.hsob.HornySOB.model.User;
import com.hsob.HornySOB.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserSevice userSevice;

    @PostMapping
    public Object saveUser(@RequestBody User user){

        return userSevice.addUser(user);
    }

}
