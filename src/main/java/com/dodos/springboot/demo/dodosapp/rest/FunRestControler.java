package com.dodos.springboot.demo.dodosapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {

    @GetMapping("/")
    public String hello(){
        return "pipes pantou";
    }
}
