package com.nhnacademy.edu.springboot.student;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(StudentApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);

//		SpringApplication.run(StudentApplication.class, args);
	}

}
