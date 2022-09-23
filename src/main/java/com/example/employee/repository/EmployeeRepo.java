package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
