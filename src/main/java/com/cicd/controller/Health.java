package com.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to prince maurya again !";
    }



}
