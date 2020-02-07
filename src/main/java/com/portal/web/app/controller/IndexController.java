package com.portal.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = { "/home", "/", "/inicio", "/index" })
	public String index() {
		return "index";
	}
}
