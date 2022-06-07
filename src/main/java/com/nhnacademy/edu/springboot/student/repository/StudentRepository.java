package com.nhnacademy.edu.springboot.student.repository;

import com.nhnacademy.edu.springboot.student.entity.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAll();
}