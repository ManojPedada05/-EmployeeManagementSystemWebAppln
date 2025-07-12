package com.cg.EmployeeManagementSystemWebAppln.service;

import java.util.List;

import com.cg.EmployeeManagementSystemWebAppln.entity.Employee;


public interface EmployeeService {
	List<Employee> getAllEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployeeById(int id);

	public void deleteById(int id);

	void saveEmployee1(Employee employee);
}