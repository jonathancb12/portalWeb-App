package com.portal.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portal.web.app.model.DAO.IUsuarioDao;

@Controller
public class UsuarioController {

	@Autowired
	private IUsuarioDao usuarioDao;
		
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Usuarios");
		model.addAttribute("usuarios",usuarioDao.findAll());
		return "listado";
	}
}
