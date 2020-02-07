package com.portal.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/authentication")
	public String login(@RequestParam(name = "correo") String email, @RequestParam(name = "contraseña") String pass,
			Model model) {
		
		model.addAttribute("mensaje", email + " " + pass);
		return "listado";
	}
}
