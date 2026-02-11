package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity(name = "employees")
@NoArgsConstructor
@Component
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(sequenceName = "employees_employee_id_seq",
    allocationSize = 1)
    private Long employee_id;

    private String first_name;

    private String last_name;

    private String email;

    private String position;
}