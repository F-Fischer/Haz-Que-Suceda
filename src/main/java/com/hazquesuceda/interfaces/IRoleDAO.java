package com.hazquesuceda.interfaces;

import com.hazquesuceda.model.Role;


public interface IRoleDAO extends IGenericDAO<Role>{

	public Role getByName(String name);
	
}
