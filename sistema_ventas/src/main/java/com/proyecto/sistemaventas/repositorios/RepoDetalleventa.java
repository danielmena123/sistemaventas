package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.sistemaventas.entidades.DetalleVenta;

public interface RepoDetalleventa extends JpaRepository<DetalleVenta, Integer>{

}
