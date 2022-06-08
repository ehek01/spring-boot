package com.nhnacademy.edu.springboot.student.controller;

import com.nhnacademy.edu.springboot.student.config.StudentProperties;
import com.nhnacademy.edu.springboot.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class StudentWebController {
    @Value("${nhn.student.name}")
    private String studentName;
    private final StudentProperties studentProperties;
    private final StudentService studentService;

    @GetMapping("/web/students/{id}")
    public String getStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudent(id));
        model.addAttribute("studentName", this.studentName);
        model.addAttribute("properties", this.studentProperties);

        return "student";
    }
}