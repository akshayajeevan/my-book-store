package com.bookstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/testController")
public class TestController {
	
	@RequestMapping(value="/printHello")
	public String printHello() {
		return "Hello Book Store... from TestController";
	}

}
