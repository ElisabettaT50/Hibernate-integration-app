package com.example.hibernateapp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToMany
    private List<EnrollmentEntity> enrollmentEntityList;

    public ClassEntity(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public ClassEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
