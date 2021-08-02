package com.youtube.amigoscode.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.youtube.amigoscode.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	Optional<Employee> findEmployeeById(Long id); //it's called query method (optional because it's not always we'll find it)
}
