package com.client.com;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		
		
		@GetMapping("/patients_record/{id}")
		public List<Object> getAllPatients(@PathVariable int id){
			
			
			
			String URL= "http://localhost:2222/Patients/patients/" + id;
			Object[] objects = restTemplate.getForObject(URL, Object[].class);
			return Arrays.asList(objects);
		}
		
		@GetMapping("/patients_record2/{name}")
		public List<Object> getAllPatients(@PathVariable String name){
			
			
			
			String URL= "http://localhost:2222/Patients/retrive/" + name ;
			Object[] objects = restTemplate.getForObject(URL, Object[].class);
			return Arrays.asList(objects);
		}
		
		
		@PostMapping("/patients_record3")
		public String getAllPatients(@RequestBody Patients patients){
			
			
			
			String URL= "http://localhost:2222/Patients/addPatients";
			URI objects = restTemplate.postForLocation(URL, patients);
			return "AddedPatientsSuccesfully";
		}
		
		@PutMapping("/patients_record4")
		public String getAllPatients1(@RequestBody Patients patients) {
			String URL ="http://localhost:2222/Patients/update";
			return "UpdatedSuccesfullu";
		}
//		


	
//		@PostMapping("/patients_record")
//		public List<Object> getAllPatients1() {
//			String URL= "http://localhost:2222/Patients/addPatients";
//			Object[] objects = restTemplate.getForObject(URL, Object[].class);
//			return Arrays.asList(objects);
//			
//		}
}

