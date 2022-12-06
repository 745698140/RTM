package com.noob.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
