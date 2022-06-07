package com.nhnacademy.edu.springboot.student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
