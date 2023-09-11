package com.broadway.healthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.broadway.healthCare.Service.IAdminService;
import com.broadway.healthCare.model.Admin;

@Controller
public class LoginController {
	@Autowired
	 private IAdminService service;
	@GetMapping("/")
	public String getLogin() {
		return "login";
	}
	@PostMapping("/login")
	public String  postLogin(@ModelAttribute Admin admin, Model model ) {
		 Admin ad=service.validAdmin(admin.getName(), admin.getPassword());
		if(ad!=null) {
			return"homePage";
		}
		model.addAttribute("message","Invalid Username and Password");
		return "login";
	}
	@GetMapping("/login")
	public String getLogout() {
		return "login";
	}
}
