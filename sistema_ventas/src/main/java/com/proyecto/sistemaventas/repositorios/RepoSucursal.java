package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.sistemaventas.entidades.Sucursal;

public interface RepoSucursal extends JpaRepository<Sucursal, Integer>{

}
