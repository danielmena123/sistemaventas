package com.proyecto.sistemaventas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NombreProveedor")
	private String nombre;
	@Column(name = "DireccionProveeedor")
	private String direccion;
	@Column(name = "EstadoProveedor")
	private int estado;
	
	//Builders
	
	public Proveedor() {}

	public Proveedor(int id, String nombre, String direccion, int estado) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.estado = estado;
	}
	
	public Proveedor(String nombre, String direccion, int estado) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estado = estado;
	}

	//Getter && Setter
	
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
