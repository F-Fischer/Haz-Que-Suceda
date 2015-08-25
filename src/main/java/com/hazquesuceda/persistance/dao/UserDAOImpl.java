package com.hazquesuceda.persistance.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hazquesuceda.interfaces.IUserDAO;
import com.hazquesuceda.model.Usuario;


@Repository
public class UserDAOImpl extends GenericDAOImpl<Usuario> implements IUserDAO{

	public UserDAOImpl(){
        super(Usuario.class);
    }

	public List<Usuario> findAllEnabled() {
		Session session = getCurrentSession();
		Criteria crit = session.createCriteria(Usuario.class);
		crit.add(Restrictions.eq("enabled", true));
		return crit.list();
	}

	public Usuario getUserByUsername(String username) {
		Session session = getCurrentSession();
		Criteria crit = session.createCriteria(Usuario.class);
		if(username != null && username != ""){
			crit.add(Restrictions.eq("username", username));
		}
		
		return (Usuario) crit.uniqueResult();
	}
	
}
