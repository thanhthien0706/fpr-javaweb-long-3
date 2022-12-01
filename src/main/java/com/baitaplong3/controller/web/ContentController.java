package com.baitaplong3.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class ContentController {
	@GetMapping("/home")
	public ModelAndView getContentPage() {
		ModelAndView mav = new ModelAndView("web/home");
		mav.addObject("pageName", "home");
		return mav;
	}

	@GetMapping("/content-add")
	public ModelAndView getAddContentPage() {
		ModelAndView mav = new ModelAndView("web/content-add");
		mav.addObject("pageName", "content-add");
		return mav;
	}
}
