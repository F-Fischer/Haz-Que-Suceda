package com.hazquesuceda.interfaces;

import java.util.List;

import com.hazquesuceda.model.User;

/**
 * 
 * @author leandrobagur
 *
 */

public interface IUserDAO extends IGenericDAO<User>{
	
	public List<User> findAllEnabled();
	public User getUserByUsername(String username);
}