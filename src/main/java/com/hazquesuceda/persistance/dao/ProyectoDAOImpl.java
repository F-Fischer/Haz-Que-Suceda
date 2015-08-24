package com.hazquesuceda.persistance.dao;

import org.springframework.stereotype.Repository;

import com.hazquesuceda.interfaces.IProyectoDAO;
import com.hazquesuceda.model.Proyecto;

@Repository
public class ProyectoDAOImpl extends GenericDAOImpl<Proyecto> implements IProyectoDAO{

	public ProyectoDAOImpl(){
        super(Proyecto.class);
    }
}
