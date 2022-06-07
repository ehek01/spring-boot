package com.nhnacademy.edu.springboot.account.controller;

import com.nhnacademy.edu.springboot.account.entity.Account;
import com.nhnacademy.edu.springboot.account.service.AccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/students")
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/student/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account student) {
        return accountService.createAccount(student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return "{\"result\":\"OK\"}";
    }
}
