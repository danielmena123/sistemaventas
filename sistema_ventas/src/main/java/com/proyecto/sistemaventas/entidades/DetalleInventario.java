
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
public class DetalleInventario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "CostoProducto")
	private double costo;
	@Column(name = "Existencias")
	private int existencias;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdProducto")
		private Producto producto;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdInventario")
		private Inventario inventario;
	
	//Builders 
	
	public DetalleInventario() {}

	public DetalleInventario(int id, double costo, int existencias, Producto producto, Inventario inventario) {
		this.id = id;
		this.costo = costo;
		this.existencias = existencias;
		this.producto = producto;
		this.inventario = inventario;
	}
	
	public DetalleInventario(double costo, int existencias, Producto producto, Inventario inventario) {
		this.costo = costo;
		this.existencias = existencias;
		this.producto = producto;
		this.inventario = inventario;
	}
	
	//Getter && Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
}