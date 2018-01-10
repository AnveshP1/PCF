package com.example.demo3.copy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class DemoApplication3 {

	@RequestMapping("/microservice3")
	public String run() {
		return "microservie3";
	}

	public static void main(String[] args) {
		/*System.setProperty("spring.config.name", "Microservice-3");*/
		SpringApplication.run(DemoApplication3.class, args);
	}
}
