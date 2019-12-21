package com.proyecto.sistemaventas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sucursal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NombreSucursal")
	private String nombre;
	@Column(name = "DireccionSucursal")
	private String direcion;
	@Column(name = "EstadoSucursal")
	private int estado;
	
	//Builders
	
	public Sucursal () {}
	
	public Sucursal(int id, String nombre, String direcion, int estado) {
		this.id = id;
		this.nombre = nombre;
		this.direcion = direcion;
		this.estado = estado;
	}
	
	public Sucursal(String nombre, String direcion, int estado) {
		this.nombre = nombre;
		this.direcion = direcion;
		this.estado = estado;
	}
	
	//Getters && Setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDirecion() {
		return direcion;
	}
	
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
