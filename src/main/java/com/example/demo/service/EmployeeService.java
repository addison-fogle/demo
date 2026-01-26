package com.example.demo.service;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EmployeeService {

    @Autowired
    private Employee employee;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
