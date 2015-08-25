package com.hazquesuceda.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "pago")
public class Pago {

	@Id
	@GeneratedValue
	@Column(name = "ID_pago")
	private int id;
/*	
	@Column(name = "ID_proyecto_pagado")
	@JoinColumn(name = "ID_proyecto", nullable = false)
	private Proyecto proyecto;
	
	@Column(name = "ID_usuario_inversor")
	@JoinColumn(name = "ID_usuario", nullable = false)
	private Inversor inversor;
*/	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "monto")
	private double monto;
/*
	@Column(name = "ID_estado_pago")
	private EstadoPago estado;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_estado_pago", nullable = false)
	public EstadoPago getEstado() {
		return estado;
	}

	public void setEstado(EstadoPago estado) {
		this.estado = estado;
	}

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_proyecto_pagado")
	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
*/	
	@Column(name = "monto",nullable = false)
	public double getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
/*
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_usuario_inversor")
	public Inversor getInversor() {
		return inversor;
	}

	public void setInversor(Inversor inversor) {
		this.inversor = inversor;
	}
*/
	@Column(name = "fecha",nullable = false)
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
