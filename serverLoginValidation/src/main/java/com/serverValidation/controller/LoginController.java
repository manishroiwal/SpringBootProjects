package com.serverValidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.serverValidation.loginEntity.LoginEnt;

import jakarta.validation.Valid;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginForm(Model m) {
			
		m.addAttribute("loginData", new LoginEnt());
		
		return "login";
	}
	
	// login data handler
	@PostMapping("/loginData")
	public String loginData(@Valid @ModelAttribute("loginData") LoginEnt log, BindingResult validate) {
		
		if(validate.hasErrors()) {
			System.out.println("system has error " +validate);
			
			return "login";
		}
		
		System.out.println(log);
		return "loginData";
	}
	
}
