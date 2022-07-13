package com.springboot.app.Controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class AppController 
{
//	@PostMapping("/hello")
//	public String sayHello(@RequestParam("personname") String personName, 
//							@RequestParam("city") String city,
//							@RequestParam("age") int age,
//							Model m) {
//		m.addAttribute("person_name", personName);
//		m.addAttribute("age", age);
//		m.addAttribute("city", city);
//		return "hello.jsp";
//	}
	
//	@PostMapping("/hello")
//	public String sayHello(@RequestParam("personName") String personName,
//							@RequestParam("city") String city,
//							@RequestParam("age") int age,
//							Model m)
//	{
//		m.addAttribute("personName", personName);
//		m.addAttribute("city", city);
//		m.addAttribute("age", age);
//		return "person.jsp";
//	}
		
	@PostMapping("/hello")
	public String sayHello(@ModelAttribute("person") Person person)
	{
		return "person.jsp";	
	}
	
	@GetMapping("/")
		public String getHomePages()
		{
			return "index.jsp";
			//used to again go for index page
		}
	
//	
//	@PostMapping("/hello")
//	public String sayHello(@ModelAttribute("person") Person person) {
//		
//		return "hello.jsp";
//	}
//	
//	@GetMapping("/")
//	public String getHomePage() {
//		return "index.jsp";
//	}
}
