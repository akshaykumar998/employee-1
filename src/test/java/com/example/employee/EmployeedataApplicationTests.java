package com.example.employee;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.employee.entities.Employee;
import com.example.employee.repository.EmployeeRepo;

@SpringBootTest
class EmployeedataApplicationTests {
	
	@Autowired
	private EmployeeRepo emp;
	
	@Test
	void saveOneEmployee() {
		Employee e1 = new Employee();
		e1.setEmail("john111@gmail.com");
		e1.setName("john");
		e1.setMobileNo(7855598564L);
		e1.setDesignation("tester");
		
		emp.save(e1);
	}
	
	@Test
	void getAllEmployee() {
		Iterable<Employee> findAll = emp.findAll();
		for(Employee employee : findAll) {
			System.out.println(employee.getId());
			System.out.println(employee.getEmail());
			System.out.println(employee.getName());
			System.out.println(employee.getMobileNo());
			System.out.println(employee.getDesignation());
		}
	}
	
	@Test
	void deleteOneEmployee() {
		emp.deleteById(1L);
	}
	
	@Test
	void updateOneEmployee() {
		Optional<Employee> fb = emp.findById(2L);
		Employee employ = new Employee();
		employ.setMobileNo(8552595532L);
		
		emp.save(employ);
	}
}
