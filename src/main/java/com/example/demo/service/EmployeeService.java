package com.example.demo.service;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        log.info("Retrieving all employees");
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public Employee getEmployee(Long id) {
        if (id == null) {
            log.warn("Employee id was null");
            return null;
        }
        log.info("Getting employee with id: {}", id);
        return employeeRepository.findById(id).orElse(null);
    }

    @Transactional
    public void saveEmployee(Employee employee) {
        log.info("Saving employee: {}", employee.getFirst_name());
        employeeRepository.save(employee);
    }
}