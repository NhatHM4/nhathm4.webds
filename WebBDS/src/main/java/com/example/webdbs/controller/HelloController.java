package com.example.webdbs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.webdbs.entity.User;
import com.example.webdbs.service.UserService;

@Controller
public class HelloController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String hello(@ModelAttribute("user") User user) {

		return "Login";
	}

	@PostMapping("/login")
	public String addemp(@ModelAttribute("user") User user, Model model) {
		List<User> listUser = new ArrayList<User>();
		listUser = userService.checkLogin(user);
		if (!listUser.isEmpty()) {
			return "redirect:https://github.com/";
		}
		model.addAttribute("message", "Sai tài khoản hoặc mật khẩu");
		return "Login";

	}
}
