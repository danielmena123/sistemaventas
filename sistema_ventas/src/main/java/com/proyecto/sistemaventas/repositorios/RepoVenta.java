package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.sistemaventas.entidades.Venta;

public interface RepoVenta extends JpaRepository<Venta, Integer> {

}
