package com.yeralitas.yeralitaspringboot.controllers;

import com.yeralitas.yeralitaspringboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
  @Autowired EmployeeService employeeService;
}
