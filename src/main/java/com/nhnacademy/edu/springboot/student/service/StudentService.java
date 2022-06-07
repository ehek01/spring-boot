package com.nhnacademy.edu.springboot.student.service;

import com.nhnacademy.edu.springboot.student.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getStudents();

    Student getStudent(Long id);

    Student createStudent(Student student);

    void deleteStudent(Long id);
}
