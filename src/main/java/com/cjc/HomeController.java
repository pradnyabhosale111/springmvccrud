package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;

@Controller
public class HomeController{
	
	@RequestMapping("/reg")
	public String regForm(@ModelAttribute("student") Student s, Model m)
	{
		System.out.println("This is Index Page Request");
		m.addAttribute(s);
		return "success";
		
	}
}
