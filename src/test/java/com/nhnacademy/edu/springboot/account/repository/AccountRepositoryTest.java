package com.nhnacademy.edu.springboot.account.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.nhnacademy.edu.springboot.account.entity.Account;
import com.nhnacademy.edu.springboot.account.service.AccountService;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

    @Test
    public void testAccountRepository() {
        // data
        Account ac1 = new Account(1L, "nh계좌", 2000);

        accountRepository.save(ac1);
        Optional<Account> account = accountRepository.findById(1L);

        // assertion
        assertThat(account).isPresent();
        assertThat(account.orElse(null)).isEqualTo(ac1);
    }

}