package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.entity.Usuario;
import com.example.demo.modelo.services.UsuarioServices;

@RestController
@CrossOrigin(origins = ("http://localhost:4200"))
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	private UsuarioServices usuaservice;

	@GetMapping("/usuario")
	public List<Usuario> index() {
		return usuaservice.findAll();
	}

	// Buscar un cliente por id
	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuaservice.findById(id);
	}

	// Guardar una area
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usua) {
		return usuaservice.save(usua);

	}

	// editar un cliente
	@PutMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usu, @PathVariable Long id) {
		Usuario usuActual = usuaservice.findById(id);
		usuActual.setNombre(usu.getNombre());
		usuActual.setClave(usu.getClave());
		usuActual.setEmail(usu.getEmail());
		usuActual.setEstado(usu.isEstado());

		return usuaservice.save(usuActual);
	}

	// eliminar un cliente
	@DeleteMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuaservice.delete(id);
	}

}
