package com.example.servingwebcontent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestGreetingController {
	
	@GetMapping("/greeting1")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		
		Greeting testObject = new Greeting();
		testObject.setID(2);
		testObject.setName("Aman");
		return testObject;
	}

}
