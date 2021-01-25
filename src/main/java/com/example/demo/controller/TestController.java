package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public void test(){
        System.out.println("这是testController");
    }
}
