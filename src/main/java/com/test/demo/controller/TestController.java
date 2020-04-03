package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @PostMapping("/test")
    public String getData() {


        return "hdshsd dsdssd dssd dsds" +
                "dsdsds dssd dssd" +
                "dsds dsdssd" +
                "test";

    }

    public String test() {

        return "welcome india";

    }


}
