package com.hello.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringControllers {
    @RequestMapping("/")

    @GetMapping
    public String hello() {
        return "Olá Spring";
    }
}
