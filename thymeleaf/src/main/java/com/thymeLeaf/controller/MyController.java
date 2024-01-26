package com.thymeLeaf.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.tomcat.util.http.ConcurrentDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	
	@RequestMapping(path ="/about", method = RequestMethod.GET)
	public String aboutHandler(Model model) {
		Date date = new Date();
		String currentdate = date.toLocaleString();
		System.out.println("this is about page");
		
		model.addAttribute("Name","Manish Kumawat");
		model.addAttribute("date", currentdate);
		return "about";
		
	}
	
	// itarate handler
	@GetMapping("/for-loop")
	public String IterateValues(Model model) {
		
		List<String> names = new ArrayList<String>();
		Collections.addAll(names, "manish", "sachin", "Payal", "Rohit");
		System.out.println(names);
		model.addAttribute("names", names);
		
		
		return "iterate";	
	}
	
	// handler for conditional statement
	
	@GetMapping("/ConditionalStatement")
	public String condition(Model model) {
		
		model.addAttribute("isActive", false);
		model.addAttribute("gender", "F");
		
		List<Integer> nums = List.of(12, 14, 16, 18, 20);
		model.addAttribute("numslist", nums);
	
		return "condition";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
