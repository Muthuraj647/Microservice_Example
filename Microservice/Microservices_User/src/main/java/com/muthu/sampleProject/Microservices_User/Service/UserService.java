package com.muthu.sampleProject.Microservices_User.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.muthu.sampleProject.Microservices_User.Entity.Department;
import com.muthu.sampleProject.Microservices_User.Entity.ResponseTemplateVO;
import com.muthu.sampleProject.Microservices_User.Entity.User;
import com.muthu.sampleProject.Microservices_User.Repository.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		
		return dao.save(user);
	}

	public ResponseTemplateVO getAll(int id) {
		// TODO Auto-generated method stub
		
		 ResponseTemplateVO responseTemplateVO=new ResponseTemplateVO();
		 
		 User user=dao.findById(id).orElseThrow(); 
		 
		 Department department=restTemplate.getForObject("http://DEPARTMENTSERVICE/department/"+user.getDepartmentId(), Department.class); responseTemplateVO.setUser(user);
		 
		 responseTemplateVO.setDepartment(department);
		
		return responseTemplateVO;
	}

	public List<User> getAllUser() {
		
		return dao.findAll();
	}

	//using conventional connection
	
	/*
	 * public ResponseTemplateVO getAll(int id) {
	 * 
	 * ResponseTemplateVO responseTemplateVO=new ResponseTemplateVO(); User
	 * user=dao.findById(id).orElseThrow(); Department
	 * department=restTemplate.getForObject("http://localhost:8081/department/"+user
	 * .getDepartmentId(), Department.class); responseTemplateVO.setUser(user);
	 * responseTemplateVO.setDepartment(department); return responseTemplateVO; }
	 */
	
	
	
	
}
