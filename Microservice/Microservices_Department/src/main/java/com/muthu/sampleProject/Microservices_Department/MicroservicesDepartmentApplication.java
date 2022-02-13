package com.muthu.sampleProject.Microservices_Department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDepartmentApplication.class, args);
	}

}
