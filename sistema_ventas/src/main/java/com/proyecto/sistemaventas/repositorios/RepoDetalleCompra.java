package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.sistemaventas.entidades.DetalleCompra;

@Repository
public interface RepoDetalleCompra extends JpaRepository<DetalleCompra, Integer>{

}
