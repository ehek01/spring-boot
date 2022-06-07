package com.nhnacademy.edu.springboot.student;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAll();
}