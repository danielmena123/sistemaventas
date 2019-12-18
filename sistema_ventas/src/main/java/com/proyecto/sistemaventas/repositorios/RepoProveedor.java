package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.sistemaventas.entidades.Proveedor;

@Repository
public interface RepoProveedor extends JpaRepository<Proveedor, Integer>{

}
