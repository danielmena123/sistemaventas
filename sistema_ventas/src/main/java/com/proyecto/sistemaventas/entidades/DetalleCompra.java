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
public class DetalleCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private int cantidad;
	@Column(name = "Subtotal")
	private double subtotal;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdProducto")
		private Producto producto;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdCompra")
		private Compra compra;
	
	// Builders
	
	public DetalleCompra() {}

	public DetalleCompra(int id, int cantidad, double subtotal, Producto producto, Compra compra) {
		this.id = id;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.producto = producto;
		this.compra = compra;
	}
	
	public DetalleCompra(int cantidad, double subtotal, Producto producto, Compra compra) {
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.producto = producto;
		this.compra = compra;
	}
	
	//Getter && Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	
}
