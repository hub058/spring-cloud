package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Eureka 客户端(服务提供者)
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Eurekaclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaclient1Application.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name){
		return "hi "+name+",i'm from port "+port;
	}
}
