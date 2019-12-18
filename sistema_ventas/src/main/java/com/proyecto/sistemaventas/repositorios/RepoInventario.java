package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.sistemaventas.entidades.Inventario;

@Repository
public interface RepoInventario extends JpaRepository<Inventario, Integer>{

}
