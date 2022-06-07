package com.nhnacademy.edu.springboot.student.service;

import com.nhnacademy.edu.springboot.student.entity.Student;
import com.nhnacademy.edu.springboot.student.repository.StudentRepository;
import com.nhnacademy.edu.springboot.student.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
