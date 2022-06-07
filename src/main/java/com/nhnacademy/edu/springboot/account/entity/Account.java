package com.nhnacademy.edu.springboot.account.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Entity
public class Account {
    @Id
    private Long id;
    private String number;
    private int balance;
}
