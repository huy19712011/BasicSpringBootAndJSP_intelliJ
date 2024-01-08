package com.example.basicspringbootandjsp_intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

    // http://localhost:8080/demoPathVariable/variable1/variable2

    @RequestMapping("/demoPathVariable/{variable1}/{variable2}")
    public String demoPathVariable(
            @PathVariable(name = "variable1") String var1,
            @PathVariable(name = "variable2") String var2,
            ModelMap model
    ) {
        model.put("var1", var1);
        model.put("var2", var2);

        return "pathVariable";
    }
}

