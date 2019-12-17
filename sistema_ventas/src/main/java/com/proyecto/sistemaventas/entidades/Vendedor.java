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
@Column
private String nombre;
@Column
private String dui;
@Column
private String direccion;
@Column
private String telefono;

public Vendedor(){}

public Vendedor(int id, String nombre, String dui, String direccion, String telefono) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.dui = dui;
	this.direccion = direccion;
	this.telefono = telefono;
}

public Vendedor(String nombre, String dui, String direccion, String telefono) {
	this.nombre = nombre;
	this.dui = dui;
	this.direccion = direccion;
	this.telefono = telefono;
}

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


}
