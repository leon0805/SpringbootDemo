package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.SayHelloDto;

@SpringBootApplication
public class DemoApplication {
	
	@RestController
	static class SayHelloController {
		
		@RequestMapping("/")
		public SayHelloDto sayHello() {
			return new SayHelloDto("hello");
		}
	}
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
