package com.example.basicspringbootandjsp_intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // http://localhost:8080/login?name=Poly&location=Hanoi
    // Model
    @RequestMapping("/login")
    public String goToLoginPage(
            @RequestParam String name,
            @RequestParam(name = "location", required = false, defaultValue = "Vietnam") String address,
            ModelMap model) {
        System.out.println("Request param: " + name);
        model.put("name", name);
        model.put("address", address);
        return "login";
    }
}

