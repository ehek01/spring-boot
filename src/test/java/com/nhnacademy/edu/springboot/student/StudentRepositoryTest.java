package com.nhnacademy.edu.springboot.student;

import static org.assertj.core.api.Assertions.assertThat;

import com.nhnacademy.edu.springboot.student.entity.Student;
import com.nhnacademy.edu.springboot.student.repository.StudentRepository;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    @DisplayName("학생 추가가 잘 되었는지 확인")
    @Test
    void testStudentRepository() {
        // data
        Student manty = new Student(1L, "manty", 100);

//        studentRepository.save(manty);
        Optional<Student> student = studentRepository.findById(1L);

        // Assertion
        assertThat(student).isPresent();
        assertThat(student.orElse(null)).isEqualTo(manty);
    }
}