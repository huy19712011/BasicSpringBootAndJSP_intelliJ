package com.example.basicspringbootandjsp_intellij.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Department {

    @Id
    private Long id;

    @OneToMany
    @JoinColumn(name = "department_id")
    private List<Employee2> employees;
}
