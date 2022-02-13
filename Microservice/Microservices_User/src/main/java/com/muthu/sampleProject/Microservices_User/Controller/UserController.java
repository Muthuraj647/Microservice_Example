package com.muthu.sampleProject.Microservices_User.Controller;

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

import com.muthu.sampleProject.Microservices_User.Entity.ResponseTemplateVO;
import com.muthu.sampleProject.Microservices_User.Entity.User;
import com.muthu.sampleProject.Microservices_User.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/add")
	public User saveUser(@RequestBody User user)
	{
		return service.saveUser(user);
	}
	
	@GetMapping("/all")
	public List<User> getUserDetails()
	{
		return service.getAllUser();
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getAllWithDepartment(@PathVariable int id)
	{
		ResponseTemplateVO response=service.getAll(id);
		
		return response;
	}
}
