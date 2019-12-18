package com.proyecto.sistemaventas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetalleVenta {
	@Id
	private int id;
	@Column
	private int cantidad;
	@Column(name = "SubTotal")
	private double precioventa;	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdProducto")
	private Producto producto;	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdVenta")
	private Venta venta;
	
	//Builders
	
	public DetalleVenta() {}
	
	public DetalleVenta(int id, int cantidad, double precioventa, Producto producto, Venta venta) {
		this.id = id;
		this.cantidad = cantidad;
		this.precioventa = precioventa;
		this.producto = producto;
		this.venta = venta;
	}
	
	public DetalleVenta(int cantidad, double precioventa, Producto producto, Venta venta) {
		this.cantidad = cantidad;
		this.precioventa = precioventa;
		this.producto = producto;
		this.venta = venta;
	}
	
	//Getters && Setters
	
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
	
	public double getPrecioventa() {
		return precioventa;
	}
	
	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}
	
	public Producto getProducto() {
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Venta getVenta() {
		return venta;
	}
	
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
}
