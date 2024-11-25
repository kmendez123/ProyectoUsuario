package com.example.demo.modelo.services;

import java.util.List;

import com.example.demo.modelo.entity.Usuario;

public interface UsuarioServices {
	public List< Usuario> findAll();
	public Usuario save(Usuario usuarios); 
	public Usuario findById(Long id);
	public void delete (Long id);
}
