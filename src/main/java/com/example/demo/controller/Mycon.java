package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



	@RestController
	public class Mycon {

		@RequestMapping("/Test")
		public String index() {
			return "Greetings from Spring Boot!";
		}

	}
	

