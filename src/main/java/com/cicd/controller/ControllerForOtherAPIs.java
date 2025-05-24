package com.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForOtherAPIs {

    // This class can be used to define other APIs as needed.
    // For example, you can add methods to handle different endpoints.

    
     @GetMapping("/example")
     public String exampleEndpoint() {
         return "This is an example endpoint returning string";
     }

}
