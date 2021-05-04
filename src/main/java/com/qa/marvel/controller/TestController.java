package com.qa.marvel.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	public String saysHello() {
		return "Jay says 'hi'";
	}
	
}
