package com.example.basicspringbootandjsp_intellij.controller;

import com.example.basicspringbootandjsp_intellij.entity.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SpringMvcFormController {

    Map<Long, Employee> employeeMap = new HashMap<>();

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("employeeHome", "employee", new Employee(1000L, "Unknown", "123456"));
    }


    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(
            @Valid @ModelAttribute("employee") final Employee employee,
            final BindingResult result,
            final ModelMap model) {

        if (result.hasErrors()) {
//            return "error";
            return "employeeHome";
        }

//        model.addAttribute("name", employee.getName());
//        model.addAttribute("contactNumber", employee.getContactNumber());
//        model.addAttribute("id", employee.getId());

        employeeMap.put(employee.getId(), employee);
        return "employeeView";
    }
}
