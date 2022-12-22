package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("name", "hyun");
		return "home";
	}
}
