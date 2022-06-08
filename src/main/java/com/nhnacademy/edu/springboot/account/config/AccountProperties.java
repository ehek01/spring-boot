package com.nhnacademy.edu.springboot.account.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.nhn.account")
@Data
public class AccountProperties {
    private String author;
}
