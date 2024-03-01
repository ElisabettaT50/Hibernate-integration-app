package com.example.hibernateapp.controller;

import com.example.hibernateapp.entity.StudentEntity;
import com.example.hibernateapp.repository.StudentRepository;
import com.example.hibernateapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scuoladevelhope")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addstudent")
    public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity student) {
        studentService.createStudent(student);
        return ResponseEntity.ok().body(student);
    }
    @GetMapping("/selectstudent")
    public ResponseEntity<List<StudentEntity>> selectAllStudent() {
        List<StudentEntity> studentEntityList = studentService.viewAll();
        return ResponseEntity.ok().body(studentEntityList);
    }
}
