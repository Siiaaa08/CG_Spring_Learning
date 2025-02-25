package com.example.firstapringapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRequestController {
    @PostMapping("/hello1")
    public String sayHello(@RequestParam String firstname , @RequestParam String lastname){
        return "Hello " +firstname+ " " +lastname+ " from Bridelabz";
    }
}
