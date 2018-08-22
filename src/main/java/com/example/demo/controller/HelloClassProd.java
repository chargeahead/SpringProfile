package com.example.demo.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class HelloClassProd implements HelloInterface{

	@Override
	public String getGreeting() {
		return "hello from prod";
	}

}
