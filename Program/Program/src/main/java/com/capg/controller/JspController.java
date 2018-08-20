package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {
	@RequestMapping("/index")
	public String showindex() {
		return "index";
	}
	@RequestMapping("/login")
	public String showlogin() {
		return "login";
	}
	
	@RequestMapping("/Admin")
	public String showAdmin() {
		return "Admin";
	}
}
