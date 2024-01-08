package com.example.basicspringbootandjsp_intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyController {

    @RequestMapping(("/default"))
    @ResponseBody
    public String responseBody() {
        return "greeting from controller";
    }
}
