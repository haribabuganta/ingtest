package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String testWorld() {
        return "who is this guy" ;
    }
    @GetMapping("/helloworld")
    public String test() {
        return "Good" ;
    }




}
