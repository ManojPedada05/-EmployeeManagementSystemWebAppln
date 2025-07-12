package com.cg.EmployeeManagementSystemWebAppln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.EmployeeManagementSystemWebAppln.entity.Employee;
import com.cg.EmployeeManagementSystemWebAppln.repository.EmployeeRepo;



@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo repo;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void saveEmployee1(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}