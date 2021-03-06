package com.client.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;





@SpringBootApplication
@EnableEurekaClient
public class WebApplication {
	@Bean
	public RestTemplate  getResTemplate() {
		return new RestTemplate();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		// TODO Auto-generated method stub

	}

}


	

