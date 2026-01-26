package com.example.demo.rest;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@Getter
@Setter
@NoArgsConstructor
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private Employee employee;

    @GetMapping("/employees")
    public List<Employee> getUsers() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> postUser(@RequestBody Employee employee) {
        log.info("postUsers with user {}", employee);
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok(employee);
    }
}
