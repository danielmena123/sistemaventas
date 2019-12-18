package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.sistemaventas.entidades.Vendedor;

public interface RepoVendedor extends JpaRepository<Vendedor, Integer>{

}
