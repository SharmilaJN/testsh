package com.harman.web;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

	@GetMapping(value="/getmessage")
	public String getMessage() {
		return "Hellow your application deployed successfully!!!!!!";
	}
	
}


