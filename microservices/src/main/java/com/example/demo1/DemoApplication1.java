package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableEurekaClient
public class DemoApplication1 {

	@RequestMapping("/microservice1")
	public String run() {
		return "microservice1";
	}

	public static void main(String[] args) {
		/*System.setProperty("spring.config.name", "Microservice-1");*/
		SpringApplication.run(DemoApplication1.class, args);
	}
}
