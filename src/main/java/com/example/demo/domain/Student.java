package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "tb_student")
@Data
public class Student {

    private String name;
}
