package com.proyecto.sistemaventas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NombreCategoria")
	private String nombre;
	
	//Builders
	public Categoria() {}
	
	public Categoria(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Categoria(String nombre) {
		this.nombre = nombre;
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
}
