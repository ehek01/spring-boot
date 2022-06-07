package com.nhnacademy.edu.springboot.account.repository;

import com.nhnacademy.edu.springboot.account.entity.Account;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAll();
}
