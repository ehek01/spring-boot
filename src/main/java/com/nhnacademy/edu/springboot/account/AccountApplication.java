package com.nhnacademy.edu.springboot.account;

import com.nhnacademy.edu.springboot.account.config.AccountProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AccountProperties.class) // bean이 됫음
@SpringBootApplication
@ConfigurationPropertiesScan
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
