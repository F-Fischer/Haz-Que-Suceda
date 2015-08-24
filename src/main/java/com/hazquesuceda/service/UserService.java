package com.hazquesuceda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hazquesuceda.interfaces.IProyectoDAO;
import com.hazquesuceda.interfaces.IRoleDAO;
import com.hazquesuceda.interfaces.IUserDAO;
import com.hazquesuceda.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private IUserDAO userDAO;
	@Autowired
	private IRoleDAO roleDAO;
	@Autowired
	private IProyectoDAO proyectoDAO;


	public User getUserByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}

	public User getById(Long userId) {
		return userDAO.getById(userId);
	}

}
