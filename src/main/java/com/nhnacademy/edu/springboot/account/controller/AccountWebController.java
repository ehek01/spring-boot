package com.nhnacademy.edu.springboot.account.controller;

import com.nhnacademy.edu.springboot.account.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AccountWebController {

    @GetMapping("/web/account/{id}")
    public String getStudent(@PathVariable Long id, Model model) {

        model.addAttribute("account", new Account(id, "nhnBank", 2000));
        return "account";
    }
}
