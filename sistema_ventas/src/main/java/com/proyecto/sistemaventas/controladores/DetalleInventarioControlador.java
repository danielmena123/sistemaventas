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

import com.proyecto.sistemaventas.entidades.DetalleInventario;
import com.proyecto.sistemaventas.repositorios.RepoDetalleInventario;

@RestController
public class DetalleInventarioControlador {

	@Autowired
	RepoDetalleInventario repo;
	
	@RequestMapping(value = "/listaDetalleInventario", method = RequestMethod.GET)
	public List<DetalleInventario> lista(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/nuevoDetalleInventario", method = RequestMethod.GET)
	public void nuevo() {
		
	}
	
	@RequestMapping(value = "/insertarDetalleInventario", method = RequestMethod.POST)
	public void insertar(@RequestBody DetalleInventario detalle) {
		repo.save(detalle);
	}
	
	@RequestMapping(value = "/editarDetalleInventario", method = RequestMethod.GET)
	public void editar(@PathVariable("id") Integer id) {
		repo.findById(id).get();
	}
	
	@RequestMapping(value = "/actualizarDetalleInventario", method = RequestMethod.PUT)
	public void actualizar(@RequestBody DetalleInventario detalle) {
		repo.save(detalle);
	}
	
	@RequestMapping(value = "/eliminarDetalleInventario", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Integer id) {
		DetalleInventario detalle = repo.findById(id).get();
		detalle.setExistencias(0);
		repo.save(detalle);
	}
}
