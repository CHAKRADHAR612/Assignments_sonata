package com.sonata.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sonata.model.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping(method=RequestMethod.GET)
	public String loginForm(Model model) {
		User user=new User();
		model.addAttribute(user);
		return "login";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String submitLogin(@Valid User user,BindingResult result) {
		if(result.hasErrors()) {
			return "login";
		}else 
			return "home";
	}
}
