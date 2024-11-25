package com.example.demo.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.entity.Usuario;

public interface Usuariodao extends CrudRepository<Usuario, Long> {

}
