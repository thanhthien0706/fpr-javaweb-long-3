package com.baitaplong3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baitaplong3.dto.UserDTO;
import com.baitaplong3.form.RegisterForm;
import com.baitaplong3.service.impl.UserService;

@Controller
public class AuthController {

	@Autowired
	UserService userService;

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

	@PostMapping("/register")
	public ModelAndView postRepgister(@ModelAttribute RegisterForm registerForm) {
		ModelAndView mav = new ModelAndView("auth/register");

		UserDTO result = userService.register(registerForm);

		if (result != null) {
			mav.addObject("notifi", true);
		} else {
			mav.addObject("notifi", false);
		}

		return mav;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("redirect:/home");
	}
}
