package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.sistemaventas.entidades.Compra;

@Repository
public interface RepoCompra extends JpaRepository<Compra, Integer>{

}
