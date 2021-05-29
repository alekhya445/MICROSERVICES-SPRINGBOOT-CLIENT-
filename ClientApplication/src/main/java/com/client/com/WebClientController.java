package com.client.com;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebClientController {

		@Autowired
		private RestTemplate restTemplate;
		
		
		@GetMapping("/patients_record")
		public List<Object> getAllPatients(){
			
			
			
			String URL= "http://localhost:2222/Patients/patients";
			Object[] objects = restTemplate.getForObject(URL, Object[].class);
			return Arrays.asList(objects);
		}
		
		

	}
