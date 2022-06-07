package com.nhnacademy.edu.springboot.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AccountWebController {

    @GetMapping("/web/students/{id}")
    public String getStudent(@PathVariable Long id, Model model) {
//        model.addAttribute("students", );

        return null;
    }
}
