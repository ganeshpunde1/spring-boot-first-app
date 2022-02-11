package com.edu.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome to SpringBoot world";
    }
}
//http://localhost:8080/welcome