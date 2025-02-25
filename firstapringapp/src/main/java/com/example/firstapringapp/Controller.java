package com.example.firstapringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping ("/hello")
    public String index(){
        return ("Hello from Bridgelabz");
    }

}

