package com.muthu.sampleProject.Microservices_Department.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.muthu.sampleProject.Microservices_Department.Entity.Department;
import com.muthu.sampleProject.Microservices_Department.Repository.DepartmentDao;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao dao;

	public Department addDep(Department department) {
		
		return dao.save(department);
	}

	public List<Department> getAllDepartments() {
		
		
		return dao.findAll();
	}

	public Department updateDep(int id, Department d) {
		
		Department department=dao.findById(id).orElseThrow();
		
		department.setDepartmentName(d.getDepartmentName());
		department.setDepartmentCode(d.getDepartmentCode());
		
		
		return dao.save(department);
	}

	public String deleteDep(int id) {
		
		dao.deleteById(id);
		return id+" deleted!";
	}

	public Department getById(int id) {
		
		
		return dao.findById(id).orElseThrow();
	}
	
	
	
}
