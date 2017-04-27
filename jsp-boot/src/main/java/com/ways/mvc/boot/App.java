package com.ways.mvc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class App {
	
	@RequestMapping("/")
	public String hello(){
		System.out.println("ss");
		return "hello";
	}
	
	@RequestMapping("/user")
	public String user(){
		System.out.println("ss");
		return "/user/user";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
