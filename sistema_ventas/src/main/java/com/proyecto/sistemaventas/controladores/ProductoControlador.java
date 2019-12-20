package com.proyecto.sistemaventas.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.sistemaventas.entidades.Producto;
import com.proyecto.sistemaventas.repositorios.RepoProducto;

@RestController
public class ProductoControlador {

	@Autowired
	RepoProducto repo;
	
	@RequestMapping(value = "/listaProducto", method = RequestMethod.GET)
	public List<Producto> lista(){
		return repo.findAll();
	}

	@RequestMapping(value = "/nuevoProducto", method = RequestMethod.GET)
	public void nuevo() {
		
	}
	
	@RequestMapping(value = "/insertarProducto", method = RequestMethod.POST)
	public void insertar(@RequestBody Producto producto) {
		repo.save(producto);
	}
	
	@RequestMapping(value = "/editarProducto", method = RequestMethod.GET)
	public void editar(@PathVariable("id") Integer id) {
		repo.findById(id);
	}
	
	@RequestMapping(value = "/actualizarProducto", method = RequestMethod.PUT)
	public void editar(@RequestBody Producto producto) {
		repo.save(producto);
	}
	
	@RequestMapping(value = "/eliminarProducto", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Integer id) {
		Producto producto = repo.findById(id).get();
		producto.setEstado(2);
		repo.save(producto);
	}
	
}
