package com.portal.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portal.web.app.model.DAO.IUsuarioDao;

@Controller
public class IndexController {

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@RequestMapping(value = { "/home", "/", "/inicio", "/index" })
	public String index(Model model) {
		model.addAttribute("titulo", "Listado de Usuarios");
		model.addAttribute("usuarios",usuarioDao.findAll());
		return "index";
	}
}
