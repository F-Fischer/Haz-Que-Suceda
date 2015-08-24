package com.hazquesuceda.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyecto")
public class Proyecto {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_proyecto")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ID_usuario_emprendedor")
	private int idEmprendedor;
	//private Emprendedor emprendedor;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "ID_rubro_proyecto")
	private int idRubro;
	//private Rubro rubro;
	
	@Column(name = "ID_estado")
	private int idEstadoProyecto;
	//private EstadoProyecto estado;
	
	@Column(name = "fecha_alta")
	private Date fechaAlta;
	
	@Column(name = "fecha_baja")
	private Date fechaBaja;
	
	@Column(name = "fecha_ultima_modificacion")
	private Date fechaUltimaModificacion;
	
	@Column(name = "cant_visitas")
	private int cantidadDeVisitas;
	
	@Column(name = "cant_veces_pago")
	private int cantidadDeVecesPago;
	
	//private ArrayList<MultimediaProyecto> multimedia;

	public Proyecto(){
		
	}
	
	public Proyecto(int id){
		this.id = id;
		this.nombre = "hola";
		this.idEmprendedor = 1;
		this.descripcion = "desc";
		this.idRubro = 1;
		this.idEstadoProyecto = 3;
		
		Date d1 = new Date();
		this.fechaAlta = d1;
		this.fechaBaja = d1;
		this.fechaUltimaModificacion = d1;
		
		this.cantidadDeVisitas = 3;
		this.cantidadDeVecesPago = 2;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}

	public int getCantidadDeVisitas() {
		return cantidadDeVisitas;
	}

	public void setCantidadDeVisitas(int cantidadDeVisitas) {
		this.cantidadDeVisitas = cantidadDeVisitas;
	}

	public int getCantidadDeVecesPago() {
		return cantidadDeVecesPago;
	}

	public void setCantidadDeVecesPago(int cantidadDeVecesPago) {
		this.cantidadDeVecesPago = cantidadDeVecesPago;
	}

	/*
	public ArrayList<MultimediaProyecto> getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(ArrayList<MultimediaProyecto> multimedia) {
		this.multimedia = multimedia;
	}
	*/
	
	public int getEstado() {
		return idEstadoProyecto;
	}
/*
	public void setEstado(EstadoProyecto estado) {
		this.idEstadoProyecto = estado.getId();
	}

	public int getEmprendedor() {
		return idEmprendedor;
	}

	public void setEmprendedor(Emprendedor emprendedor) {
		this.idEmprendedor = emprendedor.getId();
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getRubro() {
		return idRubro;
	}
/*
	public void setRubro(Rubro rubro) {
		this.idRubro = rubro.getId();
	}*/

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
