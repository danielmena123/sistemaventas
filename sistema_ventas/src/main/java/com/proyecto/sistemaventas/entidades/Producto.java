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
	@Column(name = "EstadoProducto")
	private int estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdProveedor")
		private Proveedor proveedor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdCategoria")
		private Categoria categoria;
	
	//Builders
	
	public Producto() {}

	public Producto(int id, String nombre, double precio, Proveedor proveedor, Categoria categoria, int estado) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.proveedor = proveedor;
		this.categoria = categoria;
		this.estado = estado;
	}
	
	public Producto(String nombre, double precio, Proveedor proveedor, Categoria categoria, int estado) {
		this.nombre = nombre;
		this.precio = precio;
		this.proveedor = proveedor;
		this.categoria = categoria;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
