package com.oracle.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	// http://localhost:8080/spring-mvc/hello.do

	@GetMapping(path = "/sayHello.do")
	public String sayHello() {
		return "hello"; // this will return /WEB-INF/views/hello.do
	}

}
