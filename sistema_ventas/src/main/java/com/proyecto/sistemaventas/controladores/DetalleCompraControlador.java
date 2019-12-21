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

import com.proyecto.sistemaventas.entidades.DetalleCompra;
import com.proyecto.sistemaventas.repositorios.RepoDetalleCompra;

@RestController
public class DetalleCompraControlador {

	@Autowired
	RepoDetalleCompra repo;
	
	@RequestMapping(value = "/listaDetalleCompra", method = RequestMethod.GET)
	public List<DetalleCompra> lista(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/nuevoDetalleCompra")
	public void nuevo() {
		
	}
	
	@RequestMapping(value = "/insertarDetalleCompra", method = RequestMethod.POST)
	public void insertar(@RequestBody DetalleCompra detalle) {
		repo.save(detalle);
	}
	
	@RequestMapping(value = "/editarDetalleCompra",method = RequestMethod.GET)
	public void editar(@PathVariable("id") Integer id) {
		repo.findById(id);
	}
	
	@RequestMapping(value = "/actualizarDetalleCompra", method = RequestMethod.PUT)
	public void actualizar(@RequestBody DetalleCompra detalle) {
		repo.save(detalle);
	}
	
	@RequestMapping(value = "/eliminarDetalleCompra", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id")Integer id) {
		DetalleCompra detalle = repo.findById(id).get();
		detalle.setEstado(2);
		repo.save(detalle);
	}
	
}
