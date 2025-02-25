package com.example.firstapringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/query")
    public String SayHello(@RequestParam String name){
        return "Hello " +name+ " from Bridgelabz";
    }
}
