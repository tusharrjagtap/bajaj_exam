package com.app;


import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Request;
import com.app.dto.Response;



@RestController
@SpringBootApplication
@RequestMapping("/tushar/jagtap")
public class TusharApplication {

	public static void main(String[] args) {
		SpringApplication.run(TusharApplication.class, args);
	}
	
	@PostMapping(path = "bfhl")
	public Response getData(@RequestBody Request req) {
		
		List<String> numbers = new LinkedList<>();
		List<String> alphabets = new LinkedList<>();
		
		for(String s : req.getData()) {
			
			try{
				Integer.parseInt(s);
				numbers.add(s);
			}catch(Exception e) {
				alphabets.add(s);
			}
		}
		
		Response s = new Response();
		s.setIsSuccess(true);
		s.setUserId("john_doe_17091999");
		s.setEmail("john@xyz.com");
		s.setRollNumber("ABCD123");
		s.setNumbers(numbers);
		s.setAlphabets(alphabets);
		
		return s;
	}


}


