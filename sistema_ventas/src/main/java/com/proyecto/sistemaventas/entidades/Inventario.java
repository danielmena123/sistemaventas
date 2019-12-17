package com.proyecto.sistemaventas.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inventario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdSucursal")
		private Sucursal sucursal;
	
	//Builders
	
	public Inventario() {}

	public Inventario(int id, Sucursal sucursal) {
		this.id = id;
		this.sucursal = sucursal;
	}
	
	public Inventario(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	//Getters && Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
}
