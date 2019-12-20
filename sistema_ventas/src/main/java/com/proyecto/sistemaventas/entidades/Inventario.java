
package com.proyecto.sistemaventas.entidades;

import javax.persistence.Column;
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
	@Column(name = "EstadoInventario")
	private int estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdSucursal")
		private Sucursal sucursal;
	
	//Builders
	
	public Inventario() {}

	public Inventario(int id, Sucursal sucursal, int estado) {
		this.id = id;
		this.sucursal = sucursal;
		this.estado = estado;
	}
	
	public Inventario(Sucursal sucursal, int estado) {
		this.sucursal = sucursal;
		this.estado = estado;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}