package com.hazquesuceda.persistance.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hazquesuceda.interfaces.IRoleDAO;
import com.hazquesuceda.model.Role;

/**
 * 
 * @author leandrobagur
 *
 */

@Repository
public class RoleDAOImpl extends GenericDAOImpl<Role> implements IRoleDAO{

	public RoleDAOImpl() {
		super(Role.class);
	}

	public Role getByName(String name) {
		Session session = getCurrentSession();
		Criteria crit = session.createCriteria(Role.class);
		
		crit.add(Restrictions.eq("role", name));
		return (Role) crit.uniqueResult();
	}

}
