package com.security.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/my")
	public String customPage()
	{
		return "mypage";
	}

	@RequestMapping("/my1")
	public String mpPage()
	{
		return "mypage";
	}
}
