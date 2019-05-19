package com.example.demo.dao;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public class StudentRepository extends JpaRepository<Student,Long> {

}
