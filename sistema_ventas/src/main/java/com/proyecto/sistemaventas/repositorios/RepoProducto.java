package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.sistemaventas.entidades.Producto;

@Repository
public interface RepoProducto extends JpaRepository<Producto, Integer>{

}
