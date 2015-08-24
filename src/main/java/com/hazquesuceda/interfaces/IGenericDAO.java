package com.hazquesuceda.interfaces;

import java.util.List;


public interface IGenericDAO <T>{
	
	public T getById(Long id);
	public List<T> findAll();
	public void save(T clazz);
	public void update(T clazz);
	public void delete(T clazz);
}
