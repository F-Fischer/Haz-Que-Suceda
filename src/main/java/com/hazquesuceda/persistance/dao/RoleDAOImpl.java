package com.hazquesuceda.persistance.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hazquesuceda.interfaces.IRoleDAO;
import com.hazquesuceda.model.Rol;


@Repository
public class RoleDAOImpl extends GenericDAOImpl<Rol> implements IRoleDAO{

	public RoleDAOImpl() {
		super(Rol.class);
	}

	public Rol getByName(String name) {
		Session session = getCurrentSession();
		Criteria crit = session.createCriteria(Rol.class);
		
		crit.add(Restrictions.eq("role", name));
		return (Rol) crit.uniqueResult();
	}

}
