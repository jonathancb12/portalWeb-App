package com.portal.web.app.model.DAO;

import java.util.List;

import com.portal.web.app.model.entity.Usuario;

public interface IUsuarioDao {

	public List<Usuario> findAll();
}
