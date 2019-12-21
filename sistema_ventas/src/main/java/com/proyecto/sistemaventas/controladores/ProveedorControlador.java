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

import com.proyecto.sistemaventas.entidades.Proveedor;
import com.proyecto.sistemaventas.repositorios.RepoProveedor;

@RestController
public class ProveedorControlador {
	@Autowired
	RepoProveedor repo;
	
	@RequestMapping(value = "/listaProveedor", method = RequestMethod.GET)
	public List<Proveedor> lista(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/nuevoProveedor", method = RequestMethod.GET)
	public void nuevo() {
		
	}
	
	@RequestMapping(value = "/insertarProveedor", method = RequestMethod.POST)
	public void inserat(@RequestBody Proveedor proveedor) {
		repo.save(proveedor);
	}
	
	@RequestMapping(value = "/editarProveedor", method = RequestMethod.GET)
	public void editar(@PathVariable("id") Integer id) {
		repo.findById(id);
	}
	
	@RequestMapping(value = "/actualizarProveedor", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Proveedor proveedor) {
		repo.save(proveedor);
	}
	
	@RequestMapping(value = "/eliminarProveedor", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Integer id){
		Proveedor proveedor = repo.findById(id).get();
		proveedor.setEstado(2);
		repo.save(proveedor);
	}
}
