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

import com.proyecto.sistemaventas.entidades.Inventario;
import com.proyecto.sistemaventas.repositorios.RepoInventario;

@RestController
public class InventarioControlador {

	@Autowired
	RepoInventario repo;
	
	@RequestMapping(value = "/listaInventario", method = RequestMethod.GET)
	public List<Inventario> lista(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/nuevoInventario", method = RequestMethod.GET)
	public void nuevo() {
		
	}
	
	@RequestMapping(value = "/insertarInventario", method = RequestMethod.POST)
	public void insertar(@RequestBody Inventario inventario) {
		repo.save(inventario);
	}
	
	@RequestMapping(value = "/editarInventario", method = RequestMethod.GET)
	public void editar(@PathVariable("id") Integer id) {
		repo.findById(id).get();
	}
	
	@RequestMapping(value = "/actualizarInventario", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Inventario inventario) {
		repo.save(inventario);
	}
	
	@RequestMapping(value = "/eliminarInventario", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Integer id) {
		Inventario inventario = repo.findById(id).get();
		repo.save(inventario);
	}
}
