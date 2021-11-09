package com.hsob.HornySOB.service;

import com.hsob.HornySOB.model.User;
import com.hsob.HornySOB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSevice {
    @Autowired
    UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }


}
