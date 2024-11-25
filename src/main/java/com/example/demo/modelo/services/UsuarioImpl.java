package com.example.demo.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelo.dao.Usuariodao;

import com.example.demo.modelo.entity.Usuario;

@Service
public class UsuarioImpl implements UsuarioServices {

	@Autowired
	private Usuariodao usuda;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuda.findAll();
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuarios) {
		// TODO Auto-generated method stub
		return usuda.save(usuarios);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuda.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuda.deleteById(id);

	}

}
