package com.hazquesuceda.interfaces;

import java.util.List;

import com.hazquesuceda.model.Usuario;


public interface IUsuarioDAO extends IGenericDAO<Usuario>{
	
	public List<Usuario> findAllEnabled();
	public Usuario getUserByUsername(String username);
}
