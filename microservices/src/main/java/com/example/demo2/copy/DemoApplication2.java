package com.example.demo2.copy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class DemoApplication2 {

	@RequestMapping("/microservice2")
	public  String run(){
		return "microservice2";
	}
	public static void main(String[] args) {
		/*System.setProperty("spring.config.name", "Microservice-2");*/
		SpringApplication.run(DemoApplication2.class, args);
	}
}
