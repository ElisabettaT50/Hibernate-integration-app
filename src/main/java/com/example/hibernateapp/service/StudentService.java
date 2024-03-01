package com.example.hibernateapp.service;

import com.example.hibernateapp.entity.StudentEntity;
import com.example.hibernateapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public StudentEntity createStudent(StudentEntity student) {
        studentRepository.save(student);
        return student;
    }
    public List<StudentEntity> viewAll() {
        return studentRepository.findAll();
    }
}
