package com.example.servingwebcontent;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
/*	@GetMapping("/greeting1")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	*/
	
	/*@GetMapping("/greeting1")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return greeting;
	} */
	
	@PostMapping(value = "/createPerson", consumes = "application/json", produces = "application/json")
	public String greeting(@RequestBody Greeting greeting) 
	{
		return greeting.toString();
		
		
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	

}