package org.example.registrationspringboot.controller;

import org.example.registrationspringboot.model.User;
import org.example.registrationspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

@PostMapping(value = "register", consumes = "application/json")
public User createUser(@RequestBody User user){
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
    return userRepository.save(user);
}
}
