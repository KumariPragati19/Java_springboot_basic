package com.example.demo.sevice;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeServiceInterface {
	public Employee getEmployee();

	public List<Employee> getAllEmployees();
}