package com.example.firstapringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPathController {
    @GetMapping("/hello/param/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " +name+ " from Bridelabz";
    }
}
