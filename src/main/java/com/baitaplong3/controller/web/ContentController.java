package com.baitaplong3.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baitaplong3.dto.ContentDTO;
import com.baitaplong3.dto.MyUser;
import com.baitaplong3.form.CreateContentForm;
import com.baitaplong3.service.impl.ContentService;

@Controller
@RequestMapping("/admin")
public class ContentController {

	@Autowired
	ContentService contentService;

	@GetMapping("/home")
	public ModelAndView getContentPage() {
		List<ContentDTO> dtos = contentService.findAllContent();
		ModelAndView mav = new ModelAndView("web/home");
		mav.addObject("pageName", "home");
		mav.addObject("contents", dtos);
		return mav;
	}

	@GetMapping("/content-add")
	public ModelAndView getAddContentPage() {
		ModelAndView mav = new ModelAndView("web/content-add");
		mav.addObject("pageName", "content-add");
		return mav;
	}

	@PostMapping("/content-add")
	public ModelAndView postAddContentPage(@ModelAttribute CreateContentForm createContentForm) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		MyUser myUser = (MyUser) authentication.getPrincipal();

		boolean result = contentService.createContent(myUser.getId(), createContentForm);

		ModelAndView mav = new ModelAndView("web/content-add");
		mav.addObject("pageName", "content-add");
		return mav;
	}
}
