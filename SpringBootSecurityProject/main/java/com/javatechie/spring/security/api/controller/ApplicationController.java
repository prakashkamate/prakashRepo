package com.javatechie.spring.security.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/rest/auth")
@Controller
public class ApplicationController {

//	@GetMapping("/getMsg")
//	public ModelAndView greeting() 
//	{
//		
//		return new ModelAndView("mypage");
//	}

	@GetMapping("/getMsg")
	public String greeting() 
	{
		
		return "prakash";
	}


}
