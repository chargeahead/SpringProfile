package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Autowired
	HelloInterface helloClass;
	
	@Value("${logging.file}")
	private String loggingFile;
	
	@Value("${myproperty}")
	private String myproperty;
	
  @RequestMapping("/")
  public String sayHello(Model model) {
	  String greeting = helloClass.getGreeting()+" Logging file is "+loggingFile+" myproperty is "+myproperty;;
	  model.addAttribute("greeting", greeting);
	  return "hello";
  }
}
