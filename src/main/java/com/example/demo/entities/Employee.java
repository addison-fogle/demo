package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity(name = "employees")
@Table(name = "employees")
@Component
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long employee_id;

    private String first_name;

    private String last_name;

            private String department;

    private double salary;
}
