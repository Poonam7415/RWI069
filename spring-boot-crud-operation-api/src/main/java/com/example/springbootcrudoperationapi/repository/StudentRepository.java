package com.example.springbootcrudoperationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcrudoperationapi.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
