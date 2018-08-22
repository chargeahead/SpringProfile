package com.example.demo.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class HelloClassDev implements HelloInterface {

	@Override
	public String getGreeting() {
		return "hello from dev";
	}

}
