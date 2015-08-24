package com.hazquesuceda.persistance.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hazquesuceda.interfaces.IUserDAO;
import com.hazquesuceda.model.User;

/**
 * 
 * @author leandrobagur
 *
 */

@Repository
public class UserDAOImpl extends GenericDAOImpl<User> implements IUserDAO{

	public UserDAOImpl(){
        super(User.class);
    }

	public List<User> findAllEnabled() {
		Session session = getCurrentSession();
		Criteria crit = session.createCriteria(User.class);
		crit.add(Restrictions.eq("enabled", true));
		return crit.list();
	}

	public User getUserByUsername(String username) {
		Session session = getCurrentSession();
		Criteria crit = session.createCriteria(User.class);
		if(username != null && username != ""){
			crit.add(Restrictions.eq("username", username));
		}
		
		return (User) crit.uniqueResult();
	}
	
}
