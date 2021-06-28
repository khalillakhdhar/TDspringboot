package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("users")
public class CustomerController {
@GetMapping
public String getUsers()
{
	return "<h2>afficher la <a href='/liste'> liste</a></h2>";
	
}
@GetMapping("/liste")
public ModelAndView getpage() 
{
	ModelAndView mv=new ModelAndView("liste.html");
	return mv;
}

}
