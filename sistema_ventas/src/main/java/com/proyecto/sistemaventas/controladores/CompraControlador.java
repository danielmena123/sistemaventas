package com.proyecto.sistemaventas.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.sistemaventas.entidades.Compra;
import com.proyecto.sistemaventas.repositorios.RepoCompra;

@RestController
public class CompraControlador {
	@Autowired
	RepoCompra repo;
	
	@RequestMapping(value = "/listaCompra", method = RequestMethod.GET)
	public List<Compra> listado(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/nuevaCompra", method = RequestMethod.GET)
	public void nuevo() {
		
	}
	
	@RequestMapping(value = "/insetarCompra", method = RequestMethod.POST)
	public void insertar(@RequestBody Compra compra) {
		repo.save(compra);
	}
	
	@RequestMapping(value = "/editarCompra", method = RequestMethod.GET)
	public void editar(@PathVariable("id") Integer id) {
		repo.findById(id);
	}
	
	@RequestMapping(value = "/actualizarCompra", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Compra compra) {
		repo.save(compra);
	}
	
	@RequestMapping(value = "/eliminarCompra", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id")Integer id) {
		Compra compra = repo.findById(id).get();
		compra.setEstado(2);
		repo.save(compra);
	}
}
