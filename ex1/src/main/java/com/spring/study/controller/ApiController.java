package com.spring.study.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
//	@RequestMapping(value="/api/test", method=RequestMethod.GET)
	@GetMapping("/api/test")
	@ResponseStatus(value=HttpStatus.OK)
	public String getApiTest() {
		return "\"Hi Nginx\"";
	}
}
