package com.exercice.ControllerTodo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercice.Entity.HelloWorld;

@RestController
public class Controller {

	@GetMapping(path = "/hello-wrold")
	public String helloWorld() {
		return "Hello World";
		
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorld hwb() {
		return new HelloWorld("hwb");
	}
	
	
	
	
}
