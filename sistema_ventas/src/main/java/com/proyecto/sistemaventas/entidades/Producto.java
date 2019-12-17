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
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NombreProducto")
	private String nombre;
	@Column(name = "PrecioProducto")
	private double precio;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdProveedor")
		private Proveedor proveedor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdCategoria")
		private Categoria categoria;
	
	//Builders
	
	public Producto() {}

	public Producto(int id, String nombre, double precio, Proveedor proveedor, Categoria categoria) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.proveedor = proveedor;
		this.categoria = categoria;
	}
	
	public Producto(String nombre, double precio, Proveedor proveedor, Categoria categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.proveedor = proveedor;
		this.categoria = categoria;
	}

	//Getters && Setters
	
}
