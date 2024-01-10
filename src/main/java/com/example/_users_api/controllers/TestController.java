package com.example._users_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/test")
    public String getTest(){
        return "In main branch";
    }
}
