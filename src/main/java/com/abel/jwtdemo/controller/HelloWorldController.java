package com.abel.jwtdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/v1")
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String helloWorld(){

        return "Hola JWT peeps!";
    }
}
