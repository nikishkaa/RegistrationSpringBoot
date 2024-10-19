package org.example.registrationspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/login")
    public String login(){
        return "sign-in-form";
    }

    @GetMapping("/register")
    public String signup(){
        return "sign-up-form";
    }
    @GetMapping("/index")
    public String home(){
        return "index";
    }

}
