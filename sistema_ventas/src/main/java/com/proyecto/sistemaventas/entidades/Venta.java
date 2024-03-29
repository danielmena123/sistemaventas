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
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "TotalVenta")
	private double total;
	@Column(name = "FechaVenta")
	private Date fechaventa;
	@Column(name = "EstadoVenta")
	private int estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdVendedor")
		private Vendedor vendedor;	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdCliente")
		private Cliente cliente;	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdSucursal")
		private Sucursal sucursal;
	
	
	//Builders
	
	public Venta() {}
		
	public Venta(int id, double total, Date fechaventa, Vendedor vendedor, Cliente cliente, Sucursal sucursal, int estado) {
		this.id = id;
		this.total = total;
		this.fechaventa = fechaventa;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.sucursal = sucursal;
		this.estado = estado;
	}
	
	public Venta(double total, Date fechaventa, Vendedor vendedor, Cliente cliente, Sucursal sucursal, int estado) {
		this.total = total;
		this.fechaventa = fechaventa;
		this.vendedor = vendedor;
		this.cliente = cliente;
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
	
	
	public double getTotal() {
		return total;
	}
	
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	public Date getFechaventa() {
		return fechaventa;
	}
	
	
	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
	}
	
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
