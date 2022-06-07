package com.nhnacademy.edu.springboot.account.service;

import com.nhnacademy.edu.springboot.account.entity.Account;
import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    Account getAccount(Long id);

    Account createAccount(Account student);

    void deleteAccount(Long id);
}
