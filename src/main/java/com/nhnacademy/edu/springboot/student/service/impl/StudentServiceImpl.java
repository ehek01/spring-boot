package com.nhnacademy.edu.springboot.student.service.impl;

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

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public Student createStudent(Student student) {
        boolean present = studentRepository.findById(student.getId()).isPresent();
        if (present) {
            throw new IllegalArgumentException("already exists " + student.getId());
        }
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
