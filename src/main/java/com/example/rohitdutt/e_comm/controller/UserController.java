package com.example.rohitdutt.e_comm.controller;

import com.example.rohitdutt.e_comm.data.entity.User;
import com.example.rohitdutt.e_comm.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user-all")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }

    @GetMapping("user-id/{userId}")
    public Optional<User> getUserById(@PathVariable String userId){
        return this.userRepository.findById(userId);
    }

    @PostMapping("user-create")
    public User createUser(@Valid @RequestBody User user){
        return userRepository.save(user);
    }
}

