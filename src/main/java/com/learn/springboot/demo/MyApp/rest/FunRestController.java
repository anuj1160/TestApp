package com.learn.springboot.demo.MyApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {

    @GetMapping("/")
    public String SayHello(){
        return "Hello world";
    }
}
