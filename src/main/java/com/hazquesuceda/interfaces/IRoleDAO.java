package com.hazquesuceda.interfaces;

import com.hazquesuceda.model.Rol;


public interface IRoleDAO extends IGenericDAO<Rol>{

	public Rol getByName(String name);
	
}
