package com.nhnacademy.edu.springboot.account.service;

import com.nhnacademy.edu.springboot.account.entity.Account;
import java.util.List;

public interface AccountService {
    List<Account> getAccounts();
}
