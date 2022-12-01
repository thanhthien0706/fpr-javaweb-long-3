package com.baitaplong3.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baitaplong3.dto.MyUser;
import com.baitaplong3.dto.UserDTO;
import com.baitaplong3.form.UserEditForm;
import com.baitaplong3.service.impl.UserService;

@Controller
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/profile")
	public ModelAndView getUserProfile() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		MyUser myUser = (MyUser) authentication.getPrincipal();

		UserDTO user = userService.findOneByIdDto(myUser.getId());
		user.setId(myUser.getId());

		ModelAndView mav = new ModelAndView("web/user-profile");
		mav.addObject("pageName", "user-profile");
		mav.addObject("user", user);
		return mav;
	}

	@PostMapping("/profile/{id}")
	public ModelAndView postUserProfile(@PathVariable Long id, @ModelAttribute UserEditForm userEditForm) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		MyUser myUser = (MyUser) authentication.getPrincipal();

		UserDTO user = userService.userUpdate(id, userEditForm);

		ModelAndView mav = new ModelAndView("web/user-profile");
		mav.addObject("pageName", "user-profile");
		mav.addObject("user", user);
		return mav;
	}
}
