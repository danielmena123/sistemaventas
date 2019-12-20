package com.proyecto.sistemaventas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NombreVendedor")
	private String nombre;
	@Column(name = "DUI")
	private String dui;
	@Column(name = "DireccionVendedor")
	private String direccion;
	@Column(name = "TelefonoVendedor")
	private String telefono;
	@Column(name = "EstadoVendedor")
	private int estado;
	
	
	//Builders
	
	public Vendedor(){}
	
	public Vendedor(int id, String nombre, String dui, String direccion, String telefono, int estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dui = dui;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
	}
	
	public Vendedor(String nombre, String dui, String direccion, String telefono, int estado) {
		this.nombre = nombre;
		this.dui = dui;
		this.direccion = direccion;
		this.telefono = telefono;
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
	
	public String getDui() {
		return dui;
	}
	
	public void setDui(String dui) {
		this.dui = dui;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
