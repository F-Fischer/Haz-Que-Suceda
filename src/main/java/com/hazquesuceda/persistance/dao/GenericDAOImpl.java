package com.hazquesuceda.persistance.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hazquesuceda.interfaces.IGenericDAO;


public abstract class GenericDAOImpl<T> implements IGenericDAO<T> {

	private Class<T> clazz;

	@Autowired
	protected SessionFactory sessionFactory;

	public GenericDAOImpl(Class<T> clazz) {
        this.clazz = clazz;
    }

	@SuppressWarnings("unchecked")
	public T getById(Long id) {
		return (T) getCurrentSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getCurrentSession().createQuery("from " + clazz.getName())
				.list();
	}

	public void save(T entity) {
		getCurrentSession().persist(entity);
	}

	public void update(T entity) {
		getCurrentSession().merge(entity);
	}

	public void delete(T entity) {
		getCurrentSession().delete(entity);
	}

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
