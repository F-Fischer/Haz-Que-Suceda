package com.hazquesuceda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hazquesuceda.interfaces.IProyectoDAO;
import com.hazquesuceda.model.Proyecto;


@Service
@Transactional
public class ProyectoService {

	@Autowired
	private IProyectoDAO proyectoDao;
	
	public List<Proyecto> findAll() {

		List<Proyecto> proyectos = proyectoDao.findAll();
		
		return proyectos;
	}
}
