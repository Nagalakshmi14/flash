package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	

	@GetMapping("/Menu")
	public String getPage() {
		return "display";
	}
	

}
