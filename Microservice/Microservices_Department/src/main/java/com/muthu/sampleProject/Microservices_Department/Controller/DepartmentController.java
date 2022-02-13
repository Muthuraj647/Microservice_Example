package com.muthu.sampleProject.Microservices_Department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.muthu.sampleProject.Microservices_Department.Entity.Department;
import com.muthu.sampleProject.Microservices_Department.Service.DepartmentService;

import lombok.experimental.PackagePrivate;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@PostMapping("/add")
	public ResponseEntity<Department> addEntity(@RequestBody Department department)
	{
		return new ResponseEntity<Department> (service.addDep(department), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("{id}")
	public Department getById(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	@GetMapping("/list")
	public List<Department> getAllEntity()
	{
		return (service.getAllDepartments());
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Department> updatEntity(@PathVariable int id, @RequestBody Department department)
	{
		return new ResponseEntity<Department> (service.updateDep(id,department),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteMe(int id)
	{
		return service.deleteDep(id);
	}
}
