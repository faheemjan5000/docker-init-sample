package com.example.docker.init.docker.init.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class GreetingsDocker {

    @GetMapping("/init")
    public String dockerInit(){
        return "hello docker init new feature!";
    }
}
