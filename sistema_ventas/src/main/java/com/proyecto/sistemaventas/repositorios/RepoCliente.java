package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.sistemaventas.entidades.Cliente;

public interface RepoCliente extends JpaRepository<Cliente, Integer>{

}
