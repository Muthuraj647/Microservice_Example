package com.muthu.sampleProject.Microservices_HystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class MicroservicesHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesHystrixDashboardApplication.class, args);
	}

}
