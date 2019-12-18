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
	
	//Builders
	
	public Sucursal () {}
	
	public Sucursal(int id, String nombre, String direcion) {
		this.id = id;
		this.nombre = nombre;
		this.direcion = direcion;
	}
	
	public Sucursal(String nombre, String direcion) {
		this.nombre = nombre;
		this.direcion = direcion;
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
}
