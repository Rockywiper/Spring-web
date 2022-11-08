package com.spring.web.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.model.Food;
import com.spring.web.model.Login;
import com.spring.web.repository.FoodRepository;
import com.spring.web.repository.LoginRepository;
import com.spring.web.service.LoginService;

@RestController
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	private LoginRepository loginrepo;
	@Autowired
	private LoginService loginservice;
	@Autowired
	private FoodRepository foodrepo;
	
	@GetMapping("/get")
	public ModelAndView getEmployees() 
	{
		List<Login> employees = loginrepo.findAll();
		HashMap<String, List<Login>> model = new HashMap<>();
		model.put("list", employees);
		return new ModelAndView("employeeList", model);
	}
	@GetMapping("/Food")
	public ModelAndView Main() {
		List foods = foodrepo.findAll();
		System.out.println(foods);
		
		HashMap<String,List<Food>> model = new HashMap<>();
		System.out.println(model);
		
		model.put("list", foods);
		return new ModelAndView("main",model);
		
	}
	
	@RequestMapping("/login")
	public ModelAndView login(Model model) 
	{
		Login user = new Login();
		model.addAttribute("user", user);
		return new ModelAndView("login");	
	}
	

	@RequestMapping("/check")
	public ModelAndView signin(ModelMap model,@RequestParam("username") String username,@RequestParam("password") String password) 
	{
		System.out.println(username+password);
		String a = loginservice.check(username,password);
		if(a == "got") 
		{
			return new ModelAndView("main");
		}
		model.put("errorMsg",a);
		return new ModelAndView("login");
		
	}
	@RequestMapping("/test")
	public String test()
	{
		return "working";
	}
}
