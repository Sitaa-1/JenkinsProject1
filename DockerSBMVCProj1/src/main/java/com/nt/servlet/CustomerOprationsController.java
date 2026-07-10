package com.nt.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerOprationsController
{
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
}
