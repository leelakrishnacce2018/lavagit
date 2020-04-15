package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	
	@GetMapping("/")
	public String runstatic() {
		
		Date d = new Date();
		
		
		return "Hello ->"+d.getTime();
	}

}
