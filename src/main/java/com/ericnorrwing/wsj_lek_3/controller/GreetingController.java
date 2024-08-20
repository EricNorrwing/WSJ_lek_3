package com.ericnorrwing.wsj_lek_3.controller;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greetUser(){
        return "<h1>hello world<h1/>";
    }
}
