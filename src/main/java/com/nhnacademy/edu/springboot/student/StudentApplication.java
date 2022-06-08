package com.nhnacademy.edu.springboot.student;

import com.nhnacademy.edu.springboot.student.config.StudentProperties;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(StudentProperties.class) // bean이 됫음
@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(StudentApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);

//		SpringApplication.run(StudentApplication.class, args);
	}

}
