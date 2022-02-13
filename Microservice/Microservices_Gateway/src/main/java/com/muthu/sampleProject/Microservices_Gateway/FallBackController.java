package com.muthu.sampleProject.Microservices_Gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	
	
	@RequestMapping("/userServiceFallBack")
	public String userServiceFallBack()
	{
		return "The User Service took longer than expected! maybe it's down :( \n Please try Again!";
	}
	
	@RequestMapping("/departmentServiceFallBack")
	public String departmentServiceFallBack()
	{
		return "The Department Service took longer than expected! maybe it's down :( \n Please try Again!";
	}
}
