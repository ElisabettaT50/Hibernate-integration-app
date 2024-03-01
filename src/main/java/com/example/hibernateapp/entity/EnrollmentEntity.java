package com.example.hibernateapp.entity;

import jakarta.persistence.*;

@Entity
@Table
public class EnrollmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private StudentEntity student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classes_id", nullable = false)
    private ClassEntity classEntity;

    public EnrollmentEntity(Long id, StudentEntity student, ClassEntity classEntity) {
        this.id = id;
        this.student = student;
        this.classEntity = classEntity;
    }

    public EnrollmentEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }
}
