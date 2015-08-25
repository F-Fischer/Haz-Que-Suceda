package com.hazquesuceda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "multimedia_proyectos")
public class MultimediaProyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_multimedia_proyectos")
	private int id;
	
	//@Column(name = "ID_proyecto")
	//@JoinColumn(name = "ID_proyecto")
	//private Proyecto proyecto;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "path")
	private String path;

	/*
	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	
	public Proyecto getIdProyecto() {
		return proyecto;
	}

	public void setIdProyecto(Proyecto p) {
		this.proyecto = p;
	}

	public String getTipo() {
		return tipo;
	}
*/
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}