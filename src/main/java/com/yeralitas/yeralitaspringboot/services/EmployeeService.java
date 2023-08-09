package com.yeralitas.yeralitaspringboot.services;

import com.yeralitas.yeralitaspringboot.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired EmployeeRepository employeeRepository;
}
