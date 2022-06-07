package com.nhnacademy.edu.springboot.student;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class StudentServiceImplTest {
    @Autowired
    StudentService studentService;

    @Test
    void getStudents() {
        // test
        List<Student> students = studentService.getStudents();

        // Assertion
        assertThat(students).hasSize(2);
    }
}