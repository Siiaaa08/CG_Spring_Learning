package com.example.firstapringapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRequestPathController {
    @PostMapping("/hello/{firstname}/{lastname}")
    public String sayHello(@PathVariable String firstname, @PathVariable String lastname){
        return "Hello " +firstname+ " " +lastname+ " from Bridelabz";
    }

}
