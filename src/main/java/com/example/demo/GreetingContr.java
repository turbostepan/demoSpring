package com.example.demo;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.boot.autoconfigure.jersey.JerseyProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingContr {
    String name;
    @GetMapping
    public String greet(@RequestParam String name){
        return "Poka " + name;
    }

    @GetMapping("/full")
    public String fullGreeting(@RequestParam String name, @RequestParam String surname){
        return "Hello, " + name + " " + surname + " <3";
    }
}
