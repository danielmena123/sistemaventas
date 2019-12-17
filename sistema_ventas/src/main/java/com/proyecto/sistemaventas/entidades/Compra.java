package com.proyecto.sistemaventas.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "FechaCompra")
	private Date fechacompra;
	@Column(name = "TotalCompra")
	private double totalcompra;
	@Column(name = "EstadoCompra")
	private int estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdSucursal")
		private Sucursal sucursal;
	
	//Builders
	
	public Compra() {}

	public Compra(int id, Date fechacompra, double totalcompra, int estado, Sucursal sucursal) {
		this.id = id;
		this.fechacompra = fechacompra;
		this.totalcompra = totalcompra;
		this.estado = estado;
		this.sucursal = sucursal;
	}
	
	public Compra(Date fechacompra, double totalcompra, int estado, Sucursal sucursal) {
		this.fechacompra = fechacompra;
		this.totalcompra = totalcompra;
		this.estado = estado;
		this.sucursal = sucursal;
	}

	//Getters && Setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}

	public double getTotalcompra() {
		return totalcompra;
	}

	public void setTotalcompra(double totalcompra) {
		this.totalcompra = totalcompra;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
}
