package com.baitaplong3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {

	@GetMapping("/login")
	public ModelAndView getLogin() {
		ModelAndView mav = new ModelAndView("auth/login");
		return mav;
	}

	@GetMapping("/register")
	public ModelAndView getRegister() {
		ModelAndView mav = new ModelAndView("auth/register");
		return mav;
	}
}
