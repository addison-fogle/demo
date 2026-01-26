package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class EmployeeServiceTest extends AbstractTestNGSpringContextTests {


        @Autowired
        private EmployeeService employeeService;

//        @Test
//        public void testGreet() {
//            String result = employeeService.getEmployee();
//            assertEquals(result, "Hello, Spring and TestNG!");
//        }
}
