package com.nhnacademy.edu.springboot.account.service.impl;

import com.nhnacademy.edu.springboot.account.entity.Account;
import com.nhnacademy.edu.springboot.account.repository.AccountRepository;
import com.nhnacademy.edu.springboot.account.service.AccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl
    implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    public Account createAccount(Account account) {
        accountRepository.findById(account.getId())
            .ifPresent(value -> {
                throw new IllegalArgumentException("already exist" + value.getId());
            });
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
