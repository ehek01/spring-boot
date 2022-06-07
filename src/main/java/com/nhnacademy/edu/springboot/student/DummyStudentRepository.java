package com.nhnacademy.edu.springboot.student;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DummyStudentRepository implements StudentRepository{
    @Override
    public List<Student> findAll() {
        return List.of(new Student("만티", 100), new Student("종현", 99));
    }

}
