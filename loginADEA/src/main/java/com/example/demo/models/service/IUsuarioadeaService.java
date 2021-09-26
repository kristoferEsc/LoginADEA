package com.example.demo.models.service;

import com.example.demo.models.entity.UsuarioADEA;

public interface IUsuarioadeaService {

	public UsuarioADEA findByLoginUsuario(String loginUsuario);
	
	public UsuarioADEA registrar(UsuarioADEA usuario);
	
	public UsuarioADEA cambioPass(UsuarioADEA usuario);
}
