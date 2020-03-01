package com.unla.gamificandoalgoritmos.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@RequestMapping("/hello")
	public String test() {
		return "hello";
	}
	

}
