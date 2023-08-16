package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path = "hello/{name}")
	public String hello(@PathVariable String name) {
		return "hello to jenkin : "+name;
	}
}
