package com.example.basicspringbootandjsp_intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloSpringBootAndJSP {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
