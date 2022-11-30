package com.baitaplong3.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@GetMapping("/user/profile")
	public ModelAndView getUserProfile() {
		ModelAndView mav = new ModelAndView("web/user-profile");
		mav.addObject("pageName", "user-profile");
		return mav;
	}
}
