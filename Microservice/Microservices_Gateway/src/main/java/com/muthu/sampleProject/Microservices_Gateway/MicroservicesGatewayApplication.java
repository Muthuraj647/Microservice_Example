package com.muthu.sampleProject.Microservices_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class MicroservicesGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesGatewayApplication.class, args);
	}
	
	/*
	 * @Bean public Customizer<HystrixCircuitBreakerFactory> defaultConfig() {
	 * return factory -> factory.configureDefault(id -> HystrixCommand.Setter
	 * .withGroupKey(HystrixCommandGroupKey.Factory.asKey(id))
	 * .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
	 * .withExecutionTimeoutInMilliseconds(4000))); }
	 */
}
