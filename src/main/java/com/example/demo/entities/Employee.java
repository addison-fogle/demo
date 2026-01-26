package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity(name = "employees")
@Component
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(sequenceName = "employees_employee_id_seq",
    allocationSize = 1)
    private Long employee_id;

    private String first_name;

    private String last_name;

    private String department;

    private double salary;
}