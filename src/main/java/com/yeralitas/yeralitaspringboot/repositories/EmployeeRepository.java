package com.yeralitas.yeralitaspringboot.repositories;

import com.yeralitas.yeralitaspringboot.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {}
