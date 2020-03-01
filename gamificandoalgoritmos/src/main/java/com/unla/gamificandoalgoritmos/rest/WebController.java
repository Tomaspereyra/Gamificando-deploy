package com.unla.gamificandoalgoritmos.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/hello")
	public String test() {
		return "hello";
	}
	
	

}
