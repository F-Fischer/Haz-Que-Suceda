package com.hazquesuceda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hazquesuceda.interfaces.IProyectoDAO;
import com.hazquesuceda.interfaces.IRoleDAO;
import com.hazquesuceda.interfaces.IUsuarioDAO;
import com.hazquesuceda.model.Usuario;

@Service
@Transactional
public class UserService {

	@Autowired
	private IUsuarioDAO userDAO;
	@Autowired
	private IRoleDAO roleDAO;
	@Autowired
	private IProyectoDAO proyectoDAO;


	public Usuario getUserByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}

	public Usuario getById(Long userId) {
		return userDAO.getById(userId);
	}

}
