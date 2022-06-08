package com.nhnacademy.edu.springboot.account.controller;

import com.nhnacademy.edu.springboot.account.config.AccountProperties;
import com.nhnacademy.edu.springboot.account.entity.Account;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountWebController {
    private final AccountProperties accountProperties;

    @GetMapping("/web/account/{id}")
    public String getStudent(@PathVariable Long id, Model model) {
        model.addAttribute("account", new Account(id, "nhnBank", 2000));
        return "account";
    }

    @GetMapping("/system/author")
    public SystemInfo getAuthor() {
        return new SystemInfo(accountProperties.getAuthor());
    }

    @RequiredArgsConstructor
    @Getter
    static class SystemInfo {
        private final String author;
    }
}