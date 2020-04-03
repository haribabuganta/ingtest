package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public Integer testWorld() {
        return 700 ;
    }
    @GetMapping("/helloworld")
    public String test() {
        return "Good india" ;
    }




}
