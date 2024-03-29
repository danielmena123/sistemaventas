
package com.proyecto.sistemaventas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NombreCliente")
	private String nombre;
	@Column(name = "EstadoCliente")
	private int estado;
	
	//Builders
	
	public Cliente(int id, String nombre, int estado) {
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Cliente( String nombre, int estado) {
		this.nombre = nombre;
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
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}