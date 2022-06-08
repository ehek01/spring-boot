package com.nhnacademy.edu.springboot.account.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.nhn.account")
public class AccountProperties {
    private Integer author;

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }
}
