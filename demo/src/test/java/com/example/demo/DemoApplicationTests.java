package com.example.demo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dtos.SayHelloDto;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@LocalServerPort
	int port ;

	@Test
	void contextLoads() {

	}
	@Test
	void testSayHello() {
		RestTemplate restTemplate = new RestTemplate();
		try {
			//String hello = restTemplate.getForObject("http://localhost:"+port, String.class);
			SayHelloDto dto = restTemplate.getForObject("http://localhost:"+port
					, SayHelloDto.class);
			Assertions.assertThat(dto.getMessage()).isEqualTo("hello!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
