package com.proyecto.sistemaventas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.sistemaventas.entidades.Categoria;

public interface RepoCategoria extends JpaRepository<Categoria, Integer>{
	
}
