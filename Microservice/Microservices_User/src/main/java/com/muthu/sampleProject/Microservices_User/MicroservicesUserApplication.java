package com.muthu.sampleProject.Microservices_User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.muthu.sampleProject.Microservices_User.Entity.ResponseTemplateVO;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesUserApplication.class, args);
		
	}
	
	
	  @Bean 
	  @LoadBalanced
	  public RestTemplate restTemplate()
	  { 
		  
		  return new RestTemplate(); 
	  
	  }
	 

}
